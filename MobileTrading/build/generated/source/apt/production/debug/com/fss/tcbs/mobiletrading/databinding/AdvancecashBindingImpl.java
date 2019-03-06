package com.fss.tcbs.mobiletrading.databinding;
import com.fss.tcbs.mobiletrading.R;
import com.fss.tcbs.mobiletrading.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdvancecashBindingImpl extends AdvancecashBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.indicatorbar, 1);
        sViewsWithIds.put(R.id.lblTaoGiaoDich, 2);
        sViewsWithIds.put(R.id.lblXacNhan, 3);
        sViewsWithIds.put(R.id.vTaoGiaoDich, 4);
        sViewsWithIds.put(R.id.lblTieuKhoanChuyen, 5);
        sViewsWithIds.put(R.id.spn_TieuKhoanChuyen, 6);
        sViewsWithIds.put(R.id.lblTienBanConLai, 7);
        sViewsWithIds.put(R.id.vlueTienBanConLai, 8);
        sViewsWithIds.put(R.id.btnChiTietTienBan, 9);
        sViewsWithIds.put(R.id.headerTienBan, 10);
        sViewsWithIds.put(R.id.lvTienBan, 11);
        sViewsWithIds.put(R.id.lblTienUngToiDa, 12);
        sViewsWithIds.put(R.id.vlueTienUngToiDa, 13);
        sViewsWithIds.put(R.id.lblSoTienUng, 14);
        sViewsWithIds.put(R.id.edtSoTienUng, 15);
        sViewsWithIds.put(R.id.btnChiTietTienUng, 16);
        sViewsWithIds.put(R.id.lblErrMsg, 17);
        sViewsWithIds.put(R.id.headerTienUng, 18);
        sViewsWithIds.put(R.id.phiUngPercent, 19);
        sViewsWithIds.put(R.id.lvTienUng, 20);
        sViewsWithIds.put(R.id.lblPhiUng, 21);
        sViewsWithIds.put(R.id.vluePhiUng, 22);
        sViewsWithIds.put(R.id.vXacNhan, 23);
        sViewsWithIds.put(R.id.confirm_lblTieuKhoan, 24);
        sViewsWithIds.put(R.id.confirm_vlueTieuKhoan, 25);
        sViewsWithIds.put(R.id.confirm_lblSoTienUng, 26);
        sViewsWithIds.put(R.id.confirm_vlueSoTienUng, 27);
        sViewsWithIds.put(R.id.confirm_lblPhiUng, 28);
        sViewsWithIds.put(R.id.confirm_vluePhiUng, 29);
        sViewsWithIds.put(R.id.lblMaXacNhanMess, 30);
        sViewsWithIds.put(R.id.tvMaXacNhanMess, 31);
        sViewsWithIds.put(R.id.tvTime, 32);
        sViewsWithIds.put(R.id.linearLayoutOTP, 33);
        sViewsWithIds.put(R.id.edtMaOTP, 34);
        sViewsWithIds.put(R.id.btnNhanLaiOTP, 35);
        sViewsWithIds.put(R.id.lblErrMsgOTP, 36);
        sViewsWithIds.put(R.id.buttonbar, 37);
        sViewsWithIds.put(R.id.relativeHuy, 38);
        sViewsWithIds.put(R.id.lblHuy, 39);
        sViewsWithIds.put(R.id.imgCancelBack, 40);
        sViewsWithIds.put(R.id.btnHuy, 41);
        sViewsWithIds.put(R.id.view, 42);
        sViewsWithIds.put(R.id.lblTiepTuc, 43);
        sViewsWithIds.put(R.id.btnTiepTuc, 44);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdvancecashBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 45, sIncludes, sViewsWithIds));
    }
    private AdvancecashBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[41]
            , (android.widget.Button) bindings[35]
            , (android.widget.Button) bindings[44]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[25]
            , (android.widget.EditText) bindings[34]
            , (mobiletrading.design.NumberEditText) bindings[15]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[39]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[43]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.ListView) bindings[11]
            , (android.widget.ListView) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.widget.RelativeLayout) bindings[38]
            , null
            , (mobiletrading.design.MySpinner) bindings[6]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[32]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[23]
            , (android.view.View) bindings[42]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[13]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.cashadvanceinfo == variableId) {
            setCashadvanceinfo((mobiletrading.object.CashAdvanceInfo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCashadvanceinfo(@Nullable mobiletrading.object.CashAdvanceInfo Cashadvanceinfo) {
        this.mCashadvanceinfo = Cashadvanceinfo;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cashadvanceinfo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}