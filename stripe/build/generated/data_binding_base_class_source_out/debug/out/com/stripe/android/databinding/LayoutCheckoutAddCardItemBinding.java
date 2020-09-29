// Generated by view binder compiler. Do not edit!
package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.stripe.android.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class LayoutCheckoutAddCardItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  private LayoutCheckoutAddCardItemBinding(@NonNull LinearLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutCheckoutAddCardItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutCheckoutAddCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_checkout_add_card_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutCheckoutAddCardItemBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new LayoutCheckoutAddCardItemBinding((LinearLayout) rootView);
  }
}