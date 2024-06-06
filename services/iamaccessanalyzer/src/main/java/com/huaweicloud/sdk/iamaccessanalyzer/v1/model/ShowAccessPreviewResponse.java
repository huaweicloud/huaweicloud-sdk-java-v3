package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAccessPreviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_preview")

    private AccessPreview accessPreview;

    public ShowAccessPreviewResponse withAccessPreview(AccessPreview accessPreview) {
        this.accessPreview = accessPreview;
        return this;
    }

    public ShowAccessPreviewResponse withAccessPreview(Consumer<AccessPreview> accessPreviewSetter) {
        if (this.accessPreview == null) {
            this.accessPreview = new AccessPreview();
            accessPreviewSetter.accept(this.accessPreview);
        }

        return this;
    }

    /**
     * Get accessPreview
     * @return accessPreview
     */
    public AccessPreview getAccessPreview() {
        return accessPreview;
    }

    public void setAccessPreview(AccessPreview accessPreview) {
        this.accessPreview = accessPreview;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAccessPreviewResponse that = (ShowAccessPreviewResponse) obj;
        return Objects.equals(this.accessPreview, that.accessPreview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPreview);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccessPreviewResponse {\n");
        sb.append("    accessPreview: ").append(toIndentedString(accessPreview)).append("\n");
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
