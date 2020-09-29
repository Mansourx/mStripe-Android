// Generated by view binder compiler. Do not edit!
package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.stripe.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FpxPaymentMethodBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView fpxList;

  private FpxPaymentMethodBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView fpxList) {
    this.rootView = rootView;
    this.fpxList = fpxList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FpxPaymentMethodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FpxPaymentMethodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fpx_payment_method, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FpxPaymentMethodBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fpx_list;
      RecyclerView fpxList = rootView.findViewById(id);
      if (fpxList == null) {
        break missingId;
      }

      return new FpxPaymentMethodBinding((LinearLayout) rootView, fpxList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
