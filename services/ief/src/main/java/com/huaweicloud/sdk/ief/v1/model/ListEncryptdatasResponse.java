package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEncryptdatasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_data")

    private List<EncryptData> encryptData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListEncryptdatasResponse withEncryptData(List<EncryptData> encryptData) {
        this.encryptData = encryptData;
        return this;
    }

    public ListEncryptdatasResponse addEncryptDataItem(EncryptData encryptDataItem) {
        if (this.encryptData == null) {
            this.encryptData = new ArrayList<>();
        }
        this.encryptData.add(encryptDataItem);
        return this;
    }

    public ListEncryptdatasResponse withEncryptData(Consumer<List<EncryptData>> encryptDataSetter) {
        if (this.encryptData == null) {
            this.encryptData = new ArrayList<>();
        }
        encryptDataSetter.accept(this.encryptData);
        return this;
    }

    /**
     * 加密数据列表详情
     * @return encryptData
     */
    public List<EncryptData> getEncryptData() {
        return encryptData;
    }

    public void setEncryptData(List<EncryptData> encryptData) {
        this.encryptData = encryptData;
    }

    public ListEncryptdatasResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 加密数据总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEncryptdatasResponse listEncryptdatasResponse = (ListEncryptdatasResponse) o;
        return Objects.equals(this.encryptData, listEncryptdatasResponse.encryptData)
            && Objects.equals(this.count, listEncryptdatasResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptData, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEncryptdatasResponse {\n");
        sb.append("    encryptData: ").append(toIndentedString(encryptData)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
