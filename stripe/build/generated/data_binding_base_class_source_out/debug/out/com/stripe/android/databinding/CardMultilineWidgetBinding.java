// Generated by view binder compiler. Do not edit!
package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardNumberTextInputLayout;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardMultilineWidgetBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final CardNumberEditText etCardNumber;

  @NonNull
  public final CvcEditText etCvc;

  @NonNull
  public final ExpiryDateEditText etExpiry;

  @NonNull
  public final PostalCodeEditText etPostalCode;

  @NonNull
  public final LinearLayout secondRowLayout;

  @NonNull
  public final CardNumberTextInputLayout tlCardNumber;

  @NonNull
  public final TextInputLayout tlCvc;

  @NonNull
  public final TextInputLayout tlExpiry;

  @NonNull
  public final TextInputLayout tlPostalCode;

  private CardMultilineWidgetBinding(@NonNull View rootView,
      @NonNull CardNumberEditText etCardNumber, @NonNull CvcEditText etCvc,
      @NonNull ExpiryDateEditText etExpiry, @NonNull PostalCodeEditText etPostalCode,
      @NonNull LinearLayout secondRowLayout, @NonNull CardNumberTextInputLayout tlCardNumber,
      @NonNull TextInputLayout tlCvc, @NonNull TextInputLayout tlExpiry,
      @NonNull TextInputLayout tlPostalCode) {
    this.rootView = rootView;
    this.etCardNumber = etCardNumber;
    this.etCvc = etCvc;
    this.etExpiry = etExpiry;
    this.etPostalCode = etPostalCode;
    this.secondRowLayout = secondRowLayout;
    this.tlCardNumber = tlCardNumber;
    this.tlCvc = tlCvc;
    this.tlExpiry = tlExpiry;
    this.tlPostalCode = tlPostalCode;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static CardMultilineWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.card_multiline_widget, parent);
    return bind(parent);
  }

  @NonNull
  public static CardMultilineWidgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.et_card_number;
      CardNumberEditText etCardNumber = rootView.findViewById(id);
      if (etCardNumber == null) {
        break missingId;
      }

      id = R.id.et_cvc;
      CvcEditText etCvc = rootView.findViewById(id);
      if (etCvc == null) {
        break missingId;
      }

      id = R.id.et_expiry;
      ExpiryDateEditText etExpiry = rootView.findViewById(id);
      if (etExpiry == null) {
        break missingId;
      }

      id = R.id.et_postal_code;
      PostalCodeEditText etPostalCode = rootView.findViewById(id);
      if (etPostalCode == null) {
        break missingId;
      }

      id = R.id.second_row_layout;
      LinearLayout secondRowLayout = rootView.findViewById(id);
      if (secondRowLayout == null) {
        break missingId;
      }

      id = R.id.tl_card_number;
      CardNumberTextInputLayout tlCardNumber = rootView.findViewById(id);
      if (tlCardNumber == null) {
        break missingId;
      }

      id = R.id.tl_cvc;
      TextInputLayout tlCvc = rootView.findViewById(id);
      if (tlCvc == null) {
        break missingId;
      }

      id = R.id.tl_expiry;
      TextInputLayout tlExpiry = rootView.findViewById(id);
      if (tlExpiry == null) {
        break missingId;
      }

      id = R.id.tl_postal_code;
      TextInputLayout tlPostalCode = rootView.findViewById(id);
      if (tlPostalCode == null) {
        break missingId;
      }

      return new CardMultilineWidgetBinding(rootView, etCardNumber, etCvc, etExpiry, etPostalCode,
          secondRowLayout, tlCardNumber, tlCvc, tlExpiry, tlPostalCode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}