package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchAddDataMaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masked_data")

    private List<Map<String, Object>> maskedData = null;

    public BatchAddDataMaskResponse withMaskedData(List<Map<String, Object>> maskedData) {
        this.maskedData = maskedData;
        return this;
    }

    public BatchAddDataMaskResponse addMaskedDataItem(Map<String, Object> maskedDataItem) {
        if (this.maskedData == null) {
            this.maskedData = new ArrayList<>();
        }
        this.maskedData.add(maskedDataItem);
        return this;
    }

    public BatchAddDataMaskResponse withMaskedData(Consumer<List<Map<String, Object>>> maskedDataSetter) {
        if (this.maskedData == null) {
            this.maskedData = new ArrayList<>();
        }
        maskedDataSetter.accept(this.maskedData);
        return this;
    }

    /**
     * 脱敏后的数据的数据列表，结构与请求中结构相同
     * @return maskedData
     */
    public List<Map<String, Object>> getMaskedData() {
        return maskedData;
    }

    public void setMaskedData(List<Map<String, Object>> maskedData) {
        this.maskedData = maskedData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddDataMaskResponse that = (BatchAddDataMaskResponse) obj;
        return Objects.equals(this.maskedData, that.maskedData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maskedData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddDataMaskResponse {\n");
        sb.append("    maskedData: ").append(toIndentedString(maskedData)).append("\n");
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
