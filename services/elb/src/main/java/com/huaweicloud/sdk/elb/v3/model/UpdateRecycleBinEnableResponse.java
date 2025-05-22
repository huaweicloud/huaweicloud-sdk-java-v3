package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateRecycleBinEnableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_bin")

    private RecycleBinResponseBody recycleBin;

    public UpdateRecycleBinEnableResponse withRecycleBin(RecycleBinResponseBody recycleBin) {
        this.recycleBin = recycleBin;
        return this;
    }

    public UpdateRecycleBinEnableResponse withRecycleBin(Consumer<RecycleBinResponseBody> recycleBinSetter) {
        if (this.recycleBin == null) {
            this.recycleBin = new RecycleBinResponseBody();
            recycleBinSetter.accept(this.recycleBin);
        }

        return this;
    }

    /**
     * Get recycleBin
     * @return recycleBin
     */
    public RecycleBinResponseBody getRecycleBin() {
        return recycleBin;
    }

    public void setRecycleBin(RecycleBinResponseBody recycleBin) {
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
        UpdateRecycleBinEnableResponse that = (UpdateRecycleBinEnableResponse) obj;
        return Objects.equals(this.recycleBin, that.recycleBin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recycleBin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecycleBinEnableResponse {\n");
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
