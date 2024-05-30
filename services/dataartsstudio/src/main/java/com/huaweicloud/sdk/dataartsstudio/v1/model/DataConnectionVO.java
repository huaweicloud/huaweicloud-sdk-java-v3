package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataConnectionVO
 */
public class DataConnectionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_name")

    private String dwName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    public DataConnectionVO withDwName(String dwName) {
        this.dwName = dwName;
        return this;
    }

    /**
     * 数据连接名称。
     * @return dwName
     */
    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public DataConnectionVO withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接ID。
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public DataConnectionVO withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 数据连接名称，适配现有实现。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public DataConnectionVO withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型。
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataConnectionVO that = (DataConnectionVO) obj;
        return Objects.equals(this.dwName, that.dwName) && Objects.equals(this.dwId, that.dwId)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.dwType, that.dwType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwName, dwId, displayName, dwType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataConnectionVO {\n");
        sb.append("    dwName: ").append(toIndentedString(dwName)).append("\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
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
