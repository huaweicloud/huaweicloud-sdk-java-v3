package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ListRepositoryLanguagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "languages")

    private List<LanguagesDto> languages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ListRepositoryLanguagesResponse withLanguages(List<LanguagesDto> languages) {
        this.languages = languages;
        return this;
    }

    public ListRepositoryLanguagesResponse addLanguagesItem(LanguagesDto languagesItem) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languagesItem);
        return this;
    }

    public ListRepositoryLanguagesResponse withLanguages(Consumer<List<LanguagesDto>> languagesSetter) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        languagesSetter.accept(this.languages);
        return this;
    }

    /**
     * **参数解释：** 语言描述。
     * @return languages
     */
    public List<LanguagesDto> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguagesDto> languages) {
        this.languages = languages;
    }

    public ListRepositoryLanguagesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 返回状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListRepositoryLanguagesResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepositoryLanguagesResponse that = (ListRepositoryLanguagesResponse) obj;
        return Objects.equals(this.languages, that.languages) && Objects.equals(this.status, that.status)
            && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languages, status, xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryLanguagesResponse {\n");
        sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
