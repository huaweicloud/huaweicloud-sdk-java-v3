package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAzsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_type")

    private List<String> supportType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_type")

    private String defaultType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azs")

    private Map<String, List<AzInfo>> azs = null;

    public ListAzsResponse withSupportType(List<String> supportType) {
        this.supportType = supportType;
        return this;
    }

    public ListAzsResponse addSupportTypeItem(String supportTypeItem) {
        if (this.supportType == null) {
            this.supportType = new ArrayList<>();
        }
        this.supportType.add(supportTypeItem);
        return this;
    }

    public ListAzsResponse withSupportType(Consumer<List<String>> supportTypeSetter) {
        if (this.supportType == null) {
            this.supportType = new ArrayList<>();
        }
        supportTypeSetter.accept(this.supportType);
        return this;
    }

    /**
     * 支持类型。
     * @return supportType
     */
    public List<String> getSupportType() {
        return supportType;
    }

    public void setSupportType(List<String> supportType) {
        this.supportType = supportType;
    }

    public ListAzsResponse withDefaultType(String defaultType) {
        this.defaultType = defaultType;
        return this;
    }

    /**
     * 默认类型。
     * @return defaultType
     */
    public String getDefaultType() {
        return defaultType;
    }

    public void setDefaultType(String defaultType) {
        this.defaultType = defaultType;
    }

    public ListAzsResponse withAzs(Map<String, List<AzInfo>> azs) {
        this.azs = azs;
        return this;
    }

    public ListAzsResponse putAzsItem(String key, List<AzInfo> azsItem) {
        if (this.azs == null) {
            this.azs = new HashMap<>();
        }
        this.azs.put(key, azsItem);
        return this;
    }

    public ListAzsResponse withAzs(Consumer<Map<String, List<AzInfo>>> azsSetter) {
        if (this.azs == null) {
            this.azs = new HashMap<>();
        }
        azsSetter.accept(this.azs);
        return this;
    }

    /**
     * 可用区。
     * @return azs
     */
    public Map<String, List<AzInfo>> getAzs() {
        return azs;
    }

    public void setAzs(Map<String, List<AzInfo>> azs) {
        this.azs = azs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAzsResponse that = (ListAzsResponse) obj;
        return Objects.equals(this.supportType, that.supportType) && Objects.equals(this.defaultType, that.defaultType)
            && Objects.equals(this.azs, that.azs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportType, defaultType, azs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAzsResponse {\n");
        sb.append("    supportType: ").append(toIndentedString(supportType)).append("\n");
        sb.append("    defaultType: ").append(toIndentedString(defaultType)).append("\n");
        sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
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
