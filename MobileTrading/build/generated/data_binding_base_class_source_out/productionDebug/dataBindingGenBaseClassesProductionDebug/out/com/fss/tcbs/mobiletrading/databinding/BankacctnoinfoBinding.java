package com.fss.tcbs.mobiletrading.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class BankacctnoinfoBinding extends ViewDataBinding {
  @NonNull
  public final TextView AUTOTRF;

  @NonNull
  public final TextView AvailBalance;

  @NonNull
  public final TextView BANKACCTNO;

  @NonNull
  public final TextView BANKNAME;

  @NonNull
  public final TextView FlexHoldBalance;

  @NonNull
  public final TextView HoldBalance;

  @NonNull
  public final TextView TotalBalance;

  @NonNull
  public final TextView USEIA;

  protected BankacctnoinfoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView AUTOTRF, TextView AvailBalance, TextView BANKACCTNO,
      TextView BANKNAME, TextView FlexHoldBalance, TextView HoldBalance, TextView TotalBalance,
      TextView USEIA) {
    super(_bindingComponent, _root, _localFieldCount);
    this.AUTOTRF = AUTOTRF;
    this.AvailBalance = AvailBalance;
    this.BANKACCTNO = BANKACCTNO;
    this.BANKNAME = BANKNAME;
    this.FlexHoldBalance = FlexHoldBalance;
    this.HoldBalance = HoldBalance;
    this.TotalBalance = TotalBalance;
    this.USEIA = USEIA;
  }

  @NonNull
  public static BankacctnoinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static BankacctnoinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<BankacctnoinfoBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.bankacctnoinfo, root, attachToRoot, component);
  }

  @NonNull
  public static BankacctnoinfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static BankacctnoinfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<BankacctnoinfoBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.bankacctnoinfo, null, false, component);
  }

  public static BankacctnoinfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static BankacctnoinfoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (BankacctnoinfoBinding)bind(component, view, com.fss.tcbs.mobiletrading.R.layout.bankacctnoinfo);
  }
}
