package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ListAzResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azs")

    private Map<String, List<AvailabilityZoneInfo>> azs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_type")

    private String defaultType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_type")

    private List<String> supportType = null;

    public ListAzResponse withAzs(Map<String, List<AvailabilityZoneInfo>> azs) {
        this.azs = azs;
        return this;
    }

    public ListAzResponse putAzsItem(String key, List<AvailabilityZoneInfo> azsItem) {
        if (this.azs == null) {
            this.azs = new HashMap<>();
        }
        this.azs.put(key, azsItem);
        return this;
    }

    public ListAzResponse withAzs(Consumer<Map<String, List<AvailabilityZoneInfo>>> azsSetter) {
        if (this.azs == null) {
            this.azs = new HashMap<>();
        }
        azsSetter.accept(this.azs);
        return this;
    }

    /**
     * 云应用支持的可用分区表格，按站点分类。
     * @return azs
     */
    public Map<String, List<AvailabilityZoneInfo>> getAzs() {
        return azs;
    }

    public void setAzs(Map<String, List<AvailabilityZoneInfo>> azs) {
        this.azs = azs;
    }

    public ListAzResponse withDefaultType(String defaultType) {
        this.defaultType = defaultType;
        return this;
    }

    /**
     * 默认站点类型。
     * @return defaultType
     */
    public String getDefaultType() {
        return defaultType;
    }

    public void setDefaultType(String defaultType) {
        this.defaultType = defaultType;
    }

    public ListAzResponse withSupportType(List<String> supportType) {
        this.supportType = supportType;
        return this;
    }

    public ListAzResponse addSupportTypeItem(String supportTypeItem) {
        if (this.supportType == null) {
            this.supportType = new ArrayList<>();
        }
        this.supportType.add(supportTypeItem);
        return this;
    }

    public ListAzResponse withSupportType(Consumer<List<String>> supportTypeSetter) {
        if (this.supportType == null) {
            this.supportType = new ArrayList<>();
        }
        supportTypeSetter.accept(this.supportType);
        return this;
    }

    /**
     * 云应用支持的站点类型。
     * @return supportType
     */
    public List<String> getSupportType() {
        return supportType;
    }

    public void setSupportType(List<String> supportType) {
        this.supportType = supportType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAzResponse that = (ListAzResponse) obj;
        return Objects.equals(this.azs, that.azs) && Objects.equals(this.defaultType, that.defaultType)
            && Objects.equals(this.supportType, that.supportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azs, defaultType, supportType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAzResponse {\n");
        sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
        sb.append("    defaultType: ").append(toIndentedString(defaultType)).append("\n");
        sb.append("    supportType: ").append(toIndentedString(supportType)).append("\n");
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
