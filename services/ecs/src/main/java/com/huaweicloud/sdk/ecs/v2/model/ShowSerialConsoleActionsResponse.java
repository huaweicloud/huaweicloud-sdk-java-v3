package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSerialConsoleActionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_console")

    private ShowSerialConsoleActionsOption serialConsole;

    public ShowSerialConsoleActionsResponse withSerialConsole(ShowSerialConsoleActionsOption serialConsole) {
        this.serialConsole = serialConsole;
        return this;
    }

    public ShowSerialConsoleActionsResponse withSerialConsole(
        Consumer<ShowSerialConsoleActionsOption> serialConsoleSetter) {
        if (this.serialConsole == null) {
            this.serialConsole = new ShowSerialConsoleActionsOption();
            serialConsoleSetter.accept(this.serialConsole);
        }

        return this;
    }

    /**
     * Get serialConsole
     * @return serialConsole
     */
    public ShowSerialConsoleActionsOption getSerialConsole() {
        return serialConsole;
    }

    public void setSerialConsole(ShowSerialConsoleActionsOption serialConsole) {
        this.serialConsole = serialConsole;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSerialConsoleActionsResponse that = (ShowSerialConsoleActionsResponse) obj;
        return Objects.equals(this.serialConsole, that.serialConsole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialConsole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSerialConsoleActionsResponse {\n");
        sb.append("    serialConsole: ").append(toIndentedString(serialConsole)).append("\n");
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
