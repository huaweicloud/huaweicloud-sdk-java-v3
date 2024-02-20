package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFindingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finding")

    private Finding finding;

    public ShowFindingResponse withFinding(Finding finding) {
        this.finding = finding;
        return this;
    }

    public ShowFindingResponse withFinding(Consumer<Finding> findingSetter) {
        if (this.finding == null) {
            this.finding = new Finding();
            findingSetter.accept(this.finding);
        }

        return this;
    }

    /**
     * Get finding
     * @return finding
     */
    public Finding getFinding() {
        return finding;
    }

    public void setFinding(Finding finding) {
        this.finding = finding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFindingResponse that = (ShowFindingResponse) obj;
        return Objects.equals(this.finding, that.finding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFindingResponse {\n");
        sb.append("    finding: ").append(toIndentedString(finding)).append("\n");
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
