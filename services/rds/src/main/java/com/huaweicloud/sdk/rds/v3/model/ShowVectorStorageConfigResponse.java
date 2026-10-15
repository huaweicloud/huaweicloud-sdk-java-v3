package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowVectorStorageConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vector_storage_switch")

    private Boolean vectorStorageSwitch;

    public ShowVectorStorageConfigResponse withVectorStorageSwitch(Boolean vectorStorageSwitch) {
        this.vectorStorageSwitch = vectorStorageSwitch;
        return this;
    }

    /**
     * **参数解释**：  向量存储开关。true表示已开启向量存储，false表示已关闭向量存储。  **约束限制**：  不涉及。  **取值范围**：  - true - false **默认取值**：  不涉及。
     * @return vectorStorageSwitch
     */
    public Boolean getVectorStorageSwitch() {
        return vectorStorageSwitch;
    }

    public void setVectorStorageSwitch(Boolean vectorStorageSwitch) {
        this.vectorStorageSwitch = vectorStorageSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVectorStorageConfigResponse that = (ShowVectorStorageConfigResponse) obj;
        return Objects.equals(this.vectorStorageSwitch, that.vectorStorageSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vectorStorageSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVectorStorageConfigResponse {\n");
        sb.append("    vectorStorageSwitch: ").append(toIndentedString(vectorStorageSwitch)).append("\n");
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
