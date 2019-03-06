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
import mobiletrading.object.CashAdvanceItem_Tienung;

public abstract class AdvancecashTienungItemBinding extends ViewDataBinding {
  @Bindable
  protected CashAdvanceItem_Tienung mTienUngItem;

  protected AdvancecashTienungItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTienUngItem(@Nullable CashAdvanceItem_Tienung TienUngItem);

  @Nullable
  public CashAdvanceItem_Tienung getTienUngItem() {
    return mTienUngItem;
  }

  @NonNull
  public static AdvancecashTienungItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AdvancecashTienungItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AdvancecashTienungItemBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.advancecash_tienung_item, root, attachToRoot, component);
  }

  @NonNull
  public static AdvancecashTienungItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AdvancecashTienungItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AdvancecashTienungItemBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.advancecash_tienung_item, null, false, component);
  }

  public static AdvancecashTienungItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static AdvancecashTienungItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (AdvancecashTienungItemBinding)bind(component, view, com.fss.tcbs.mobiletrading.R.layout.advancecash_tienung_item);
  }
}
