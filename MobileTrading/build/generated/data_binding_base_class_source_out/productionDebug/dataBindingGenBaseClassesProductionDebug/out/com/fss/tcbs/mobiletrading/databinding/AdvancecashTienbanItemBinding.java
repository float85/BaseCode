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
import mobiletrading.object.CashAdvanceItem_TienBan;

public abstract class AdvancecashTienbanItemBinding extends ViewDataBinding {
  @Bindable
  protected CashAdvanceItem_TienBan mTienBanItem;

  protected AdvancecashTienbanItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTienBanItem(@Nullable CashAdvanceItem_TienBan TienBanItem);

  @Nullable
  public CashAdvanceItem_TienBan getTienBanItem() {
    return mTienBanItem;
  }

  @NonNull
  public static AdvancecashTienbanItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AdvancecashTienbanItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AdvancecashTienbanItemBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.advancecash_tienban_item, root, attachToRoot, component);
  }

  @NonNull
  public static AdvancecashTienbanItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AdvancecashTienbanItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AdvancecashTienbanItemBinding>inflate(inflater, com.fss.tcbs.mobiletrading.R.layout.advancecash_tienban_item, null, false, component);
  }

  public static AdvancecashTienbanItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static AdvancecashTienbanItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (AdvancecashTienbanItemBinding)bind(component, view, com.fss.tcbs.mobiletrading.R.layout.advancecash_tienban_item);
  }
}
