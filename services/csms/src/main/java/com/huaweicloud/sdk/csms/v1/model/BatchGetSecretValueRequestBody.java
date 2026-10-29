package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchGetSecretValueRequestBody
 */
public class BatchGetSecretValueRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name_list")

    private List<String> secretNameList = null;

    public BatchGetSecretValueRequestBody withSecretNameList(List<String> secretNameList) {
        this.secretNameList = secretNameList;
        return this;
    }

    public BatchGetSecretValueRequestBody addSecretNameListItem(String secretNameListItem) {
        if (this.secretNameList == null) {
            this.secretNameList = new ArrayList<>();
        }
        this.secretNameList.add(secretNameListItem);
        return this;
    }

    public BatchGetSecretValueRequestBody withSecretNameList(Consumer<List<String>> secretNameListSetter) {
        if (this.secretNameList == null) {
            this.secretNameList = new ArrayList<>();
        }
        secretNameListSetter.accept(this.secretNameList);
        return this;
    }

    /**
     * **参数解释：**  待获取凭据值的凭据名称。 **约束限制：**  不涉及  **取值范围：** 不涉及  **默认取值：**  不涉及
     * @return secretNameList
     */
    public List<String> getSecretNameList() {
        return secretNameList;
    }

    public void setSecretNameList(List<String> secretNameList) {
        this.secretNameList = secretNameList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchGetSecretValueRequestBody that = (BatchGetSecretValueRequestBody) obj;
        return Objects.equals(this.secretNameList, that.secretNameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretNameList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGetSecretValueRequestBody {\n");
        sb.append("    secretNameList: ").append(toIndentedString(secretNameList)).append("\n");
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
