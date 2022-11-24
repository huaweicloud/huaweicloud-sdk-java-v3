package com.huaweicloud.sdk.cpts.v1.model;

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
public class ShowTempSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temps")

    private List<TempDetailInfo> temps = null;

    public ShowTempSetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowTempSetResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowTempSetResponse withTemps(List<TempDetailInfo> temps) {
        this.temps = temps;
        return this;
    }

    public ShowTempSetResponse addTempsItem(TempDetailInfo tempsItem) {
        if (this.temps == null) {
            this.temps = new ArrayList<>();
        }
        this.temps.add(tempsItem);
        return this;
    }

    public ShowTempSetResponse withTemps(Consumer<List<TempDetailInfo>> tempsSetter) {
        if (this.temps == null) {
            this.temps = new ArrayList<>();
        }
        tempsSetter.accept(this.temps);
        return this;
    }

    /**
     * temps
     * @return temps
     */
    public List<TempDetailInfo> getTemps() {
        return temps;
    }

    public void setTemps(List<TempDetailInfo> temps) {
        this.temps = temps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTempSetResponse showTempSetResponse = (ShowTempSetResponse) o;
        return Objects.equals(this.code, showTempSetResponse.code)
            && Objects.equals(this.message, showTempSetResponse.message)
            && Objects.equals(this.temps, showTempSetResponse.temps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, temps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTempSetResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    temps: ").append(toIndentedString(temps)).append("\n");
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
