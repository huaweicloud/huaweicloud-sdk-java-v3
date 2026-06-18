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
public class ShowRepositoryNavigationOutlineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revision")

    private String revision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "symbols")

    private List<SymbolNodeDto> symbols = null;

    public ShowRepositoryNavigationOutlineResponse withResult(String result) {
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

    public ShowRepositoryNavigationOutlineResponse withMessage(String message) {
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

    public ShowRepositoryNavigationOutlineResponse withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **约束限制：** 不涉及。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ShowRepositoryNavigationOutlineResponse withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * **参数解释：** 所在版本号（commit id）。 **约束限制：** 不涉及。
     * @return revision
     */
    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public ShowRepositoryNavigationOutlineResponse withSymbols(List<SymbolNodeDto> symbols) {
        this.symbols = symbols;
        return this;
    }

    public ShowRepositoryNavigationOutlineResponse addSymbolsItem(SymbolNodeDto symbolsItem) {
        if (this.symbols == null) {
            this.symbols = new ArrayList<>();
        }
        this.symbols.add(symbolsItem);
        return this;
    }

    public ShowRepositoryNavigationOutlineResponse withSymbols(Consumer<List<SymbolNodeDto>> symbolsSetter) {
        if (this.symbols == null) {
            this.symbols = new ArrayList<>();
        }
        symbolsSetter.accept(this.symbols);
        return this;
    }

    /**
     * **参数解释：** 符号列表。 **约束限制：** 不涉及。
     * @return symbols
     */
    public List<SymbolNodeDto> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<SymbolNodeDto> symbols) {
        this.symbols = symbols;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryNavigationOutlineResponse that = (ShowRepositoryNavigationOutlineResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.message, that.message)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.revision, that.revision)
            && Objects.equals(this.symbols, that.symbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, message, filePath, revision, symbols);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryNavigationOutlineResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
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
