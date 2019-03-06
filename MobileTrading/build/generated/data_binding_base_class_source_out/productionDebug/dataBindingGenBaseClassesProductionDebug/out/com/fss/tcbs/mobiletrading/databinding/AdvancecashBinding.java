package com.fss.tcbs.mobiletrading.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobiletrading.design.MySpinner;
import mobiletrading.design.NumberEditText;
import mobiletrading.object.CashAdvanceInfo;

public abstract class AdvancecashBinding extends ViewDataBinding {
  @NonNull
  public final Button btnChiTietTienBan;

  @NonNull
  public final Button btnChiTietTienUng;

  @NonNull
  public final Button btnHuy;

  @NonNull
  public final Button btnNhanLaiOTP;

  @NonNull
  public final Button btnTiepTuc;

  @NonNull
  public final LinearLayout buttonbar;

  @NonNull
  public final TextView confirmLblPhiUng;

  @NonNull
  public final TextView confirmLblSoTienUng;

  @NonNull
  public final TextView confirmLblTieuKhoan;

  @NonNull
  public final TextView confirmVluePhiUng;

  @NonNull
  public final TextView confirmVlueSoTienUng;

  @NonNull
  public final TextView confirmVlueTieuKhoan;

  @NonNull
  public final EditText edtMaOTP;

  @NonNull
  public final NumberEditText edtSoTienUng;

  @NonNull
  public final LinearLayout headerTienBan;

  @NonNull
  public final LinearLayout headerTienUng;

  @NonNull
  public final ImageView imgCancelBack;

  @NonNull
  public final LinearLayout indicatorbar;

  @NonNull
  public final TextView lblErrMsg;

  @NonNull
  public final TextView lblErrMsgOTP;

  @NonNull
  public final TextView lblHuy;

  @NonNull
  public final LinearLayout lblMaXacNhanMess;

  @NonNull
  public final TextView lblPhiUng;

  @NonNull
  public final TextView lblSoTienUng;

  @NonNull
  public final TextView lblTaoGiaoDich;

  @NonNull
  public final TextView lblTienBanConLai;

  @NonNull
  public final TextView lblTienUngToiDa;

  @NonNull
  public final TextView lblTiepTuc;

  @NonNull
  public final TextView lblTieuKhoanChuyen;

  @NonNull
  public final TextView lblXacNhan;

  @NonNull
  public final LinearLayout linearLayoutOTP;

  @NonNull
  public final ListView lvTienBan;

  @NonNull
  public final ListView lvTienUng;

  @NonNull
  public final TextView phiUngPercent;

  @NonNull
  public final RelativeLayout relativeHuy;

  @Nullable
  public final RelativeLayout relativeTiepTuc;

  @NonNull
  public final MySpinner spnTieuKhoanChuyen;

  @NonNull
  public final TextView tvMaXacNhanMess;

  @NonNull
  public final TextView tvTime;

  @NonNull
  public final RelativeLayout vTaoGiaoDich;

  @NonNull
  public final RelativeLayout vXacNhan;

  @NonNull
  public final View view;

  @NonNull
  public final TextView vluePhiUng;

  @NonNull
  public final TextView vlueTienBanConLai;

  @NonNull
  public final TextView vlueTienUngToiDa;

  @Bindable
  protected CashAdvanceInfo mCashadvanceinfo;

  protected AdvancecashBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnChiTietTienBan, Button btnChiTietTienUng, Button btnHuy,
      Button btnNhanLaiOTP, Button btnTiepTuc, LinearLayout buttonbar, TextView confirmLblPhiUng,
      TextView confirmLblSoTienUng, TextView confirmLblTieuKhoan, TextView confirmVluePhiUng,
      TextView confirmVlueSoTienUng, TextView confirmVlueTieuKhoan, EditText edtMaOTP,
      NumberEditText edtSoTienUng, LinearLayout headerTienBan, LinearLayout headerTienUng,
      ImageView imgCancelBack, LinearLayout indicatorbar, TextView lblErrMsg, TextView lblErrMsgOTP,
      TextView lblHuy, LinearLayout lblMaXacNhanMess, TextView lblPhiUng, TextView lblSoTienUng,
      TextView lblTaoGiaoDich, TextView lblTienBanConLai, TextView lblTienUngToiDa,
      TextView lblTiepTuc, TextView lblTieuKhoanChuyen, TextView lblXacNhan,
      LinearLayout linearLayoutOTP, ListView lvTienBan, ListView lvTienUng, TextView phiUngPercent,
      RelativeLayout relativeHuy, RelativeLayout relativeTiepTuc, MySpinner spnTieuKhoanChuyen,
      TextView tvMaXacNhanMess, TextView tvTime, RelativeLayout vTaoGiaoDich,
      RelativeLayout vXacNhan, View view, TextView vluePhiUng, TextView vlueTienBanConLai,
      TextView vlueTienUngToiDa) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnChiTietTienBan = btnChiTietTienBan;
    this.btnChiTietTienUng = btnChiTietTienUng;
    this.btnHuy = btnHuy;
    this.btnNhanLaiOTP = btnNhanLaiOTP;
    this.btnTiepTuc = btnTiepTuc;
    this.buttonbar = buttonbar;
    this.confirmLblPhiUng = confirmLblPhiUng;
    this.confirmLblSoTienUng = confirmLblSoTienUng;
    this.confirmLblTieuKhoan = confirmLblTieuKhoan;
    this.confirmVluePhiUng = confirmVluePhiUng;
    this.confirmVlueSoTienUng = confirmVlueSoTienUng;
    this.confirmVlueTieuKhoan = confirmVlueTieuKhoan;
    this.edtMaOTP = edtMaOTP;
    this.edtSoTienUng = edtSoTienUng;
    this.headerTienBan = headerTienBan;
    this.headerTienUng = headerTienUng;
    this.imgCancelBack = imgCancelBack;
    this.indicatorbar = indicatorbar;
    this.lblErrMsg = lblErrMsg;
    this.lblErrMsgOTP = lblErrMsgOTP;
    this.lblHuy = lblHuy;
    this.lblMaXacNhanMess = lblMaXacNhanMess;
    this.lblPhiUng = lblPhiUng;
    this.lblSoTienUng = lblSoTienUng;
    this.lblTaoGiaoDich = lblTaoGiaoDich;
    this.lblTienBanConLai = lblTienBanConLai;
    this.lblTienUngToiDa = lblTienUngToiDa;
    this.lblTiepTuc = lblTiepTuc;
    this.lblTieuKhoanChuyen = lblTieuKhoanChuyen;
    this.lblXacNhan = lblXacNhan;
    this.linearLayoutOTP = linearLayoutOTP;
    this.lvTienBan = lvTienBan;
    this.lvTienUng = lvTienUng;
    this.phiUngPercent = phiUngPercent;
    this.relativeHuy = relativeHuy;
    this.relativeTiepTuc = relativeTiepTuc;
    this.spnTieuKhoanChuyen = spnTieuKhoanChuyen;
    this.tvMaXacNhanMess = tvMaXacNhanMess;
    this.tvTime = tvTime;
    this.vTaoGiaoDich = vTaoGiaoDich;
    this.vXacNhan = vXacNhan;
    this.view = view;
    this.vluePhiUng = vluePhiUng;
    this.vlueTienBanConLai = vlueTienBanConLai;
    this.vlueTienUngToiDa = vlueTienUngToiDa;
  }

  public abstract void setCashadvanceinfo(@Nullable CashAdvanceInfo cashadvanceinfo);

  @Nullable
  public CashAdvanceInfo getCashadvanceinfo() {
    return mCashadvanceinfo;
  }

  @NonNull
  public static AdvancecashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AdvancecashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AdvancecashBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.advancecash, root, attachToRoot, component);
  }

  @NonNull
  public static AdvancecashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AdvancecashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AdvancecashBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.advancecash, null, false, component);
  }

  public static AdvancecashBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static AdvancecashBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (AdvancecashBinding)bind(component, view, com.fss.tcbs.mobiletrading.R.layout.advancecash);
  }
}
