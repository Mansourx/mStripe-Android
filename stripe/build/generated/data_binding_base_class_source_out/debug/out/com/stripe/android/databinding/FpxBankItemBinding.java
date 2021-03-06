// Generated by view binder compiler. Do not edit!
package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.stripe.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FpxBankItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatImageView checkIcon;

  @NonNull
  public final AppCompatImageView icon;

  @NonNull
  public final AppCompatTextView name;

  private FpxBankItemBinding(@NonNull LinearLayout rootView, @NonNull AppCompatImageView checkIcon,
      @NonNull AppCompatImageView icon, @NonNull AppCompatTextView name) {
    this.rootView = rootView;
    this.checkIcon = checkIcon;
    this.icon = icon;
    this.name = name;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FpxBankItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FpxBankItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fpx_bank_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FpxBankItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.check_icon;
      AppCompatImageView checkIcon = rootView.findViewById(id);
      if (checkIcon == null) {
        break missingId;
      }

      id = R.id.icon;
      AppCompatImageView icon = rootView.findViewById(id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.name;
      AppCompatTextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      return new FpxBankItemBinding((LinearLayout) rootView, checkIcon, icon, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
