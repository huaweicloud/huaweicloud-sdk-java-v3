package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 例外的日期，valid_dates表示需要执行的日期，invalid_dates表示不执行的日期。其优先级最高，优先级：ExceptionalDates &gt; weekdays &gt; start_time-endtime
 */
public class ExceptionalDates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_dates")

    private List<String> validDates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invalid_dates")

    private List<String> invalidDates = null;

    public ExceptionalDates withValidDates(List<String> validDates) {
        this.validDates = validDates;
        return this;
    }

    public ExceptionalDates addValidDatesItem(String validDatesItem) {
        if (this.validDates == null) {
            this.validDates = new ArrayList<>();
        }
        this.validDates.add(validDatesItem);
        return this;
    }

    public ExceptionalDates withValidDates(Consumer<List<String>> validDatesSetter) {
        if (this.validDates == null) {
            this.validDates = new ArrayList<>();
        }
        validDatesSetter.accept(this.validDates);
        return this;
    }

    /**
     * 例外日期
     * @return validDates
     */
    public List<String> getValidDates() {
        return validDates;
    }

    public void setValidDates(List<String> validDates) {
        this.validDates = validDates;
    }

    public ExceptionalDates withInvalidDates(List<String> invalidDates) {
        this.invalidDates = invalidDates;
        return this;
    }

    public ExceptionalDates addInvalidDatesItem(String invalidDatesItem) {
        if (this.invalidDates == null) {
            this.invalidDates = new ArrayList<>();
        }
        this.invalidDates.add(invalidDatesItem);
        return this;
    }

    public ExceptionalDates withInvalidDates(Consumer<List<String>> invalidDatesSetter) {
        if (this.invalidDates == null) {
            this.invalidDates = new ArrayList<>();
        }
        invalidDatesSetter.accept(this.invalidDates);
        return this;
    }

    /**
     * 无效日期
     * @return invalidDates
     */
    public List<String> getInvalidDates() {
        return invalidDates;
    }

    public void setInvalidDates(List<String> invalidDates) {
        this.invalidDates = invalidDates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExceptionalDates that = (ExceptionalDates) obj;
        return Objects.equals(this.validDates, that.validDates) && Objects.equals(this.invalidDates, that.invalidDates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validDates, invalidDates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceptionalDates {\n");
        sb.append("    validDates: ").append(toIndentedString(validDates)).append("\n");
        sb.append("    invalidDates: ").append(toIndentedString(invalidDates)).append("\n");
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
