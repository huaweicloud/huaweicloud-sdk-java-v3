package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateSerialConsoleOptionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_console_options")

    private UpdateSerialConsoleOptionsOption serialConsoleOptions;

    public UpdateSerialConsoleOptionsRequestBody withSerialConsoleOptions(
        UpdateSerialConsoleOptionsOption serialConsoleOptions) {
        this.serialConsoleOptions = serialConsoleOptions;
        return this;
    }

    public UpdateSerialConsoleOptionsRequestBody withSerialConsoleOptions(
        Consumer<UpdateSerialConsoleOptionsOption> serialConsoleOptionsSetter) {
        if (this.serialConsoleOptions == null) {
            this.serialConsoleOptions = new UpdateSerialConsoleOptionsOption();
            serialConsoleOptionsSetter.accept(this.serialConsoleOptions);
        }

        return this;
    }

    /**
     * Get serialConsoleOptions
     * @return serialConsoleOptions
     */
    public UpdateSerialConsoleOptionsOption getSerialConsoleOptions() {
        return serialConsoleOptions;
    }

    public void setSerialConsoleOptions(UpdateSerialConsoleOptionsOption serialConsoleOptions) {
        this.serialConsoleOptions = serialConsoleOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSerialConsoleOptionsRequestBody that = (UpdateSerialConsoleOptionsRequestBody) obj;
        return Objects.equals(this.serialConsoleOptions, that.serialConsoleOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialConsoleOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSerialConsoleOptionsRequestBody {\n");
        sb.append("    serialConsoleOptions: ").append(toIndentedString(serialConsoleOptions)).append("\n");
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
