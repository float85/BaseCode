package com.fss.tcbs.mobiletrading;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.fss.tcbs.mobiletrading.databinding.AdvancecashBindingImpl;
import com.fss.tcbs.mobiletrading.databinding.AdvancecashBindingLargeImpl;
import com.fss.tcbs.mobiletrading.databinding.AdvancecashTienbanItemBindingImpl;
import com.fss.tcbs.mobiletrading.databinding.AdvancecashTienungItemBindingImpl;
import com.fss.tcbs.mobiletrading.databinding.BankacctnoinfoBindingImpl;
import com.fss.tcbs.mobiletrading.databinding.BankacctnoinfoBindingLargeImpl;
import com.fss.tcbs.mobiletrading.databinding.OrderconfirmAmendConfirmBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADVANCECASH = 1;

  private static final int LAYOUT_ADVANCECASHTIENBANITEM = 2;

  private static final int LAYOUT_ADVANCECASHTIENUNGITEM = 3;

  private static final int LAYOUT_BANKACCTNOINFO = 4;

  private static final int LAYOUT_ORDERCONFIRMAMENDCONFIRM = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fss.tcbs.mobiletrading.R.layout.advancecash, LAYOUT_ADVANCECASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fss.tcbs.mobiletrading.R.layout.advancecash_tienban_item, LAYOUT_ADVANCECASHTIENBANITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fss.tcbs.mobiletrading.R.layout.advancecash_tienung_item, LAYOUT_ADVANCECASHTIENUNGITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fss.tcbs.mobiletrading.R.layout.bankacctnoinfo, LAYOUT_BANKACCTNOINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fss.tcbs.mobiletrading.R.layout.orderconfirm_amend_confirm, LAYOUT_ORDERCONFIRMAMENDCONFIRM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADVANCECASH: {
          if ("layout-large/advancecash_0".equals(tag)) {
            return new AdvancecashBindingLargeImpl(component, view);
          }
          if ("layout/advancecash_0".equals(tag)) {
            return new AdvancecashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for advancecash is invalid. Received: " + tag);
        }
        case  LAYOUT_ADVANCECASHTIENBANITEM: {
          if ("layout/advancecash_tienban_item_0".equals(tag)) {
            return new AdvancecashTienbanItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for advancecash_tienban_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ADVANCECASHTIENUNGITEM: {
          if ("layout/advancecash_tienung_item_0".equals(tag)) {
            return new AdvancecashTienungItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for advancecash_tienung_item is invalid. Received: " + tag);
        }
        case  LAYOUT_BANKACCTNOINFO: {
          if ("layout-large/bankacctnoinfo_0".equals(tag)) {
            return new BankacctnoinfoBindingLargeImpl(component, view);
          }
          if ("layout/bankacctnoinfo_0".equals(tag)) {
            return new BankacctnoinfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bankacctnoinfo is invalid. Received: " + tag);
        }
        case  LAYOUT_ORDERCONFIRMAMENDCONFIRM: {
          if ("layout/orderconfirm_amend_confirm_0".equals(tag)) {
            return new OrderconfirmAmendConfirmBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for orderconfirm_amend_confirm is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "cashadvanceinfo");
      sKeys.put(2, "TienUngItem");
      sKeys.put(3, "tienUngItem");
      sKeys.put(4, "tienBanItem");
      sKeys.put(5, "TienBanItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout-large/advancecash_0", com.fss.tcbs.mobiletrading.R.layout.advancecash);
      sKeys.put("layout/advancecash_0", com.fss.tcbs.mobiletrading.R.layout.advancecash);
      sKeys.put("layout/advancecash_tienban_item_0", com.fss.tcbs.mobiletrading.R.layout.advancecash_tienban_item);
      sKeys.put("layout/advancecash_tienung_item_0", com.fss.tcbs.mobiletrading.R.layout.advancecash_tienung_item);
      sKeys.put("layout-large/bankacctnoinfo_0", com.fss.tcbs.mobiletrading.R.layout.bankacctnoinfo);
      sKeys.put("layout/bankacctnoinfo_0", com.fss.tcbs.mobiletrading.R.layout.bankacctnoinfo);
      sKeys.put("layout/orderconfirm_amend_confirm_0", com.fss.tcbs.mobiletrading.R.layout.orderconfirm_amend_confirm);
    }
  }
}
