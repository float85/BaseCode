package com.fss.tcbs.mobiletrading.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobiletrading.design.LabelContentLayout;

public abstract class OrderconfirmAmendConfirmBinding extends ViewDataBinding {
  @NonNull
  public final Button btnCheckorderAccept;

  @NonNull
  public final CheckBox checkboxSaveOTPOrder;

  @NonNull
  public final EditText etSaveOTPOrder;

  @NonNull
  public final LinearLayout laySolenhChitiet1;

  @NonNull
  public final TextView lblCheckorderOrderinfo;

  @NonNull
  public final View lineCheckorder1;

  @NonNull
  public final LabelContentLayout textCheckorderFromDate;

  @NonNull
  public final LabelContentLayout textCheckorderGia;

  @NonNull
  public final TextView textCheckorderLoaiLenh;

  @NonNull
  public final TextView textCheckorderMaCK;

  @NonNull
  public final TextView textCheckorderSide;

  @NonNull
  public final LabelContentLayout textCheckorderSoLuong;

  @NonNull
  public final LabelContentLayout textCheckorderSoLuuKy;

  @NonNull
  public final LabelContentLayout textCheckorderTieuKhoan;

  @NonNull
  public final LabelContentLayout textCheckorderToDate;

  @NonNull
  public final RelativeLayout vOTPOrder;

  @NonNull
  public final RelativeLayout vSaveOTPOrder;

  protected OrderconfirmAmendConfirmBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnCheckorderAccept, CheckBox checkboxSaveOTPOrder,
      EditText etSaveOTPOrder, LinearLayout laySolenhChitiet1, TextView lblCheckorderOrderinfo,
      View lineCheckorder1, LabelContentLayout textCheckorderFromDate,
      LabelContentLayout textCheckorderGia, TextView textCheckorderLoaiLenh,
      TextView textCheckorderMaCK, TextView textCheckorderSide,
      LabelContentLayout textCheckorderSoLuong, LabelContentLayout textCheckorderSoLuuKy,
      LabelContentLayout textCheckorderTieuKhoan, LabelContentLayout textCheckorderToDate,
      RelativeLayout vOTPOrder, RelativeLayout vSaveOTPOrder) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCheckorderAccept = btnCheckorderAccept;
    this.checkboxSaveOTPOrder = checkboxSaveOTPOrder;
    this.etSaveOTPOrder = etSaveOTPOrder;
    this.laySolenhChitiet1 = laySolenhChitiet1;
    this.lblCheckorderOrderinfo = lblCheckorderOrderinfo;
    this.lineCheckorder1 = lineCheckorder1;
    this.textCheckorderFromDate = textCheckorderFromDate;
    this.textCheckorderGia = textCheckorderGia;
    this.textCheckorderLoaiLenh = textCheckorderLoaiLenh;
    this.textCheckorderMaCK = textCheckorderMaCK;
    this.textCheckorderSide = textCheckorderSide;
    this.textCheckorderSoLuong = textCheckorderSoLuong;
    this.textCheckorderSoLuuKy = textCheckorderSoLuuKy;
    this.textCheckorderTieuKhoan = textCheckorderTieuKhoan;
    this.textCheckorderToDate = textCheckorderToDate;
    this.vOTPOrder = vOTPOrder;
    this.vSaveOTPOrder = vSaveOTPOrder;
  }

  @NonNull
  public static OrderconfirmAmendConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static OrderconfirmAmendConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<OrderconfirmAmendConfirmBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.orderconfirm_amend_confirm, root, attachToRoot, component);
  }

  @NonNull
  public static OrderconfirmAmendConfirmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static OrderconfirmAmendConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<OrderconfirmAmendConfirmBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.orderconfirm_amend_confirm, null, false, component);
  }

  public static OrderconfirmAmendConfirmBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static OrderconfirmAmendConfirmBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (OrderconfirmAmendConfirmBinding)bind(component, view, com.fss.tcbs.mobiletrading.R.layout.orderconfirm_amend_confirm);
  }
}
