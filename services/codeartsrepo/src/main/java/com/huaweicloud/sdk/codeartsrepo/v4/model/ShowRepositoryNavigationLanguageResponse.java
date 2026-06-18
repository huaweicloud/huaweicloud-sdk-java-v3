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
public class ShowRepositoryNavigationLanguageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language_list")

    private List<LanguageDto> languageList = null;

    public ShowRepositoryNavigationLanguageResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释：** 结果标识。 **约束限制：** 不涉及。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ShowRepositoryNavigationLanguageResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 结果消息。 **约束限制：** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowRepositoryNavigationLanguageResponse withLanguageList(List<LanguageDto> languageList) {
        this.languageList = languageList;
        return this;
    }

    public ShowRepositoryNavigationLanguageResponse addLanguageListItem(LanguageDto languageListItem) {
        if (this.languageList == null) {
            this.languageList = new ArrayList<>();
        }
        this.languageList.add(languageListItem);
        return this;
    }

    public ShowRepositoryNavigationLanguageResponse withLanguageList(Consumer<List<LanguageDto>> languageListSetter) {
        if (this.languageList == null) {
            this.languageList = new ArrayList<>();
        }
        languageListSetter.accept(this.languageList);
        return this;
    }

    /**
     * **参数解释：** 语言列表。 **约束限制：** 不涉及。
     * @return languageList
     */
    public List<LanguageDto> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<LanguageDto> languageList) {
        this.languageList = languageList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryNavigationLanguageResponse that = (ShowRepositoryNavigationLanguageResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.message, that.message)
            && Objects.equals(this.languageList, that.languageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, message, languageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryNavigationLanguageResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    languageList: ").append(toIndentedString(languageList)).append("\n");
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
