package customwidget.keyboardhook;

import android.content.Context;
import android.g.customwidget.R;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by giang.ngo on 09-12-2015.
 */
public class KeyboardHookNew extends LinearLayout {

    Context context;
    RecyclerView recyclerView;
    KeyboardHookAdapter adapter;
    List<String> listSymsToShow;
    String[] allSyms;
    EditText edt;
    TextWatcher textWatcher;

    public static int[] attrsArray = new int[]{android.R.attr.layout_width, // 0
            android.R.attr.layout_height, // 1
    };

    public KeyboardHookNew(Context context) {
        super(context);
    }

    public KeyboardHookNew(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.keyboardhook_new, this);

        initTextWatcher();

        recyclerView = (RecyclerView) findViewById(R.id.kbhook_recyclerview);
        initRecyclerView();
    }

    private void initTextWatcher() {
        textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (isCustomKeyboardVisible()) {
                    refreshDataOfKeyboardHook();
                }
            }
        };
    }

    public KeyboardHookNew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initRecyclerView() {
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(context);
        mLinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLinearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        listSymsToShow = new ArrayList<>();
        adapter = new KeyboardHookAdapter(listSymsToShow);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(String symbol) {
                if (edt != null) {
                    edt.setText(symbol);
                    edt.setSelection(symbol.length());
                }
            }
        });
        recyclerView.setAdapter(adapter);
    }

    public void show(View v, String[] syms) {
        if (v instanceof EditText) {
            edt = (EditText) v;
            edt.addTextChangedListener(textWatcher);
        } else {
            edt = null;
        }
        allSyms = syms;
        refreshDataOfKeyboardHook();
        this.setVisibility(VISIBLE);
    }

    public void refreshWithSyms(String[] syms) {
        allSyms = syms;
        refreshDataOfKeyboardHook();
    }

    public void hide() {
        edt = null;
        this.setVisibility(GONE);
    }

    private void refreshDataOfKeyboardHook() {
        String filterText = (edt == null) ? "" : edt.getText().toString();
        filterSymbolByText(filterText);
        adapter.notifyDataSetChanged();
    }

    private void filterSymbolByText(String filterText) {
        listSymsToShow.clear();
        if (allSyms == null) {
            return;
        }

        // neu filterText rong => khong filter (add het tat ca cac ma)
        if (filterText == null || filterText.length() == 0) {
            int count = allSyms.length;
            for (int i = 0; i < count; i++) {
                listSymsToShow.add(allSyms[i]);
            }
            return;
        }

        int count = allSyms.length;
        for (int i = 0; i < count; i++) {
            String symCode = allSyms[i];
            if (symCode.startsWith(filterText)) {
                listSymsToShow.add(allSyms[i]);
            }
        }

    }

    public interface OnItemClickListener {
        public void onClick(String symbol);
    }

    public boolean isCustomKeyboardVisible() {
        return (this.getVisibility() == VISIBLE);
    }
}
