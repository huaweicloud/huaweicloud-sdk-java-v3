package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：更新回收站配置的请求体。
 */
public class UpdateRecycleBinPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_bin")

    private RecycleBinPolicyRequestBody recycleBin;

    public UpdateRecycleBinPolicyRequestBody withRecycleBin(RecycleBinPolicyRequestBody recycleBin) {
        this.recycleBin = recycleBin;
        return this;
    }

    public UpdateRecycleBinPolicyRequestBody withRecycleBin(Consumer<RecycleBinPolicyRequestBody> recycleBinSetter) {
        if (this.recycleBin == null) {
            this.recycleBin = new RecycleBinPolicyRequestBody();
            recycleBinSetter.accept(this.recycleBin);
        }

        return this;
    }

    /**
     * Get recycleBin
     * @return recycleBin
     */
    public RecycleBinPolicyRequestBody getRecycleBin() {
        return recycleBin;
    }

    public void setRecycleBin(RecycleBinPolicyRequestBody recycleBin) {
        this.recycleBin = recycleBin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRecycleBinPolicyRequestBody that = (UpdateRecycleBinPolicyRequestBody) obj;
        return Objects.equals(this.recycleBin, that.recycleBin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recycleBin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecycleBinPolicyRequestBody {\n");
        sb.append("    recycleBin: ").append(toIndentedString(recycleBin)).append("\n");
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
