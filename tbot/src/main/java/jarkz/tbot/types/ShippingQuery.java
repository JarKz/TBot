package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object contains information about an incoming shipping query. */
public final class ShippingQuery {

  public static final class Builder {

    private ShippingQuery buildingType;

    public Builder() {
      buildingType = new ShippingQuery();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setFrom(User from) {
      buildingType.from = from;
      return this;
    }

    public Builder setInvoicePayload(String invoicePayload) {
      buildingType.invoicePayload = invoicePayload;
      return this;
    }

    public Builder setShippingAddress(ShippingAddress shippingAddress) {
      buildingType.shippingAddress = shippingAddress;
      return this;
    }

    public ShippingQuery build() {
      return buildingType;
    }
  }

  /** Unique query identifier */
  @NotNull public String id;

  /** User who sent the query */
  @NotNull public User from;

  /** Bot specified invoice payload */
  @NotNull
  @SerializedName("invoice_payload")
  public String invoicePayload;

  /** User specified shipping address */
  @NotNull
  @SerializedName("shipping_address")
  public ShippingAddress shippingAddress;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ShippingQuery other)) return false;
    return Objects.equals(id, other.id)
        && Objects.equals(from, other.from)
        && Objects.equals(invoicePayload, other.invoicePayload)
        && Objects.equals(shippingAddress, other.shippingAddress);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(id, from, invoicePayload, shippingAddress);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ShippingQuery[id=")
        .append(id)
        .append(", from=")
        .append(from)
        .append(", invoicePayload=")
        .append(invoicePayload)
        .append(", shippingAddress=")
        .append(shippingAddress)
        .append("]");
    return builder.toString();
  }
}
