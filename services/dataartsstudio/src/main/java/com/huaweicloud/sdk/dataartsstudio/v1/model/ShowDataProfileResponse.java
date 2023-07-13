package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDataProfileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ProfileInfo data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rowkey")

    private String rowkey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowDataProfileResponse withData(ProfileInfo data) {
        this.data = data;
        return this;
    }

    public ShowDataProfileResponse withData(Consumer<ProfileInfo> dataSetter) {
        if (this.data == null) {
            this.data = new ProfileInfo();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ProfileInfo getData() {
        return data;
    }

    public void setData(ProfileInfo data) {
        this.data = data;
    }

    public ShowDataProfileResponse withRowkey(String rowkey) {
        this.rowkey = rowkey;
        return this;
    }

    /**
     * 行键
     * @return rowkey
     */
    public String getRowkey() {
        return rowkey;
    }

    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }

    public ShowDataProfileResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataProfileResponse that = (ShowDataProfileResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.rowkey, that.rowkey)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, rowkey, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataProfileResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    rowkey: ").append(toIndentedString(rowkey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
