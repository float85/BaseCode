package com.fss.tcbs.mobiletrading.databinding;
import com.fss.tcbs.mobiletrading.R;
import com.fss.tcbs.mobiletrading.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdvancecashTienungItemBindingImpl extends AdvancecashTienungItemBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdvancecashTienungItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private AdvancecashTienungItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.TienUngItem == variableId) {
            setTienUngItem((mobiletrading.object.CashAdvanceItem_Tienung) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTienUngItem(@Nullable mobiletrading.object.CashAdvanceItem_Tienung TienUngItem) {
        this.mTienUngItem = TienUngItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.TienUngItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String tienUngItemTxDate = null;
        mobiletrading.object.CashAdvanceItem_Tienung tienUngItem = mTienUngItem;
        java.lang.String tienUngItemDays = null;
        java.lang.String tienUngItemAmtr = null;
        java.lang.String tienUngItemFee = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tienUngItem != null) {
                    // read TienUngItem.txDate
                    tienUngItemTxDate = tienUngItem.txDate;
                    // read TienUngItem.days
                    tienUngItemDays = tienUngItem.days;
                    // read TienUngItem.amtr
                    tienUngItemAmtr = tienUngItem.amtr;
                    // read TienUngItem.fee
                    tienUngItemFee = tienUngItem.fee;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, tienUngItemTxDate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, tienUngItemAmtr);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, tienUngItemDays);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, tienUngItemFee);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): TienUngItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}