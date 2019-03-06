package com.fss.tcbs.mobiletrading.databinding;
import com.fss.tcbs.mobiletrading.R;
import com.fss.tcbs.mobiletrading.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdvancecashTienbanItemBindingImpl extends AdvancecashTienbanItemBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdvancecashTienbanItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private AdvancecashTienbanItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.TienBanItem == variableId) {
            setTienBanItem((mobiletrading.object.CashAdvanceItem_TienBan) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTienBanItem(@Nullable mobiletrading.object.CashAdvanceItem_TienBan TienBanItem) {
        this.mTienBanItem = TienBanItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.TienBanItem);
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
        java.lang.String tienBanItemTradingAmount = null;
        java.lang.String tienBanItemTradingDate = null;
        java.lang.String tienBanItemNumberAdvanceDate = null;
        mobiletrading.object.CashAdvanceItem_TienBan tienBanItem = mTienBanItem;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tienBanItem != null) {
                    // read TienBanItem.tradingAmount
                    tienBanItemTradingAmount = tienBanItem.tradingAmount;
                    // read TienBanItem.tradingDate
                    tienBanItemTradingDate = tienBanItem.tradingDate;
                    // read TienBanItem.numberAdvanceDate
                    tienBanItemNumberAdvanceDate = tienBanItem.numberAdvanceDate;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, tienBanItemTradingDate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, tienBanItemTradingAmount);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, tienBanItemNumberAdvanceDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): TienBanItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}