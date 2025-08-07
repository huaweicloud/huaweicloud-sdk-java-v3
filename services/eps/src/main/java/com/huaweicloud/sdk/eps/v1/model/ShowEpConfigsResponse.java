package com.huaweicloud.sdk.eps.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEpConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_item")

    private EnterpriseProjectConfig supportItem;

    public ShowEpConfigsResponse withSupportItem(EnterpriseProjectConfig supportItem) {
        this.supportItem = supportItem;
        return this;
    }

    public ShowEpConfigsResponse withSupportItem(Consumer<EnterpriseProjectConfig> supportItemSetter) {
        if (this.supportItem == null) {
            this.supportItem = new EnterpriseProjectConfig();
            supportItemSetter.accept(this.supportItem);
        }

        return this;
    }

    /**
     * Get supportItem
     * @return supportItem
     */
    public EnterpriseProjectConfig getSupportItem() {
        return supportItem;
    }

    public void setSupportItem(EnterpriseProjectConfig supportItem) {
        this.supportItem = supportItem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEpConfigsResponse that = (ShowEpConfigsResponse) obj;
        return Objects.equals(this.supportItem, that.supportItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEpConfigsResponse {\n");
        sb.append("    supportItem: ").append(toIndentedString(supportItem)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
