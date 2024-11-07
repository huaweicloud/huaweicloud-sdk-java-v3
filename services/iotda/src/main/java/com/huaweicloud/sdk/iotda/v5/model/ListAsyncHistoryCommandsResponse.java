package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListAsyncHistoryCommandsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commands")

    private List<AsyncDeviceListCommand> commands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private HistoryCommandPage page;

    public ListAsyncHistoryCommandsResponse withCommands(List<AsyncDeviceListCommand> commands) {
        this.commands = commands;
        return this;
    }

    public ListAsyncHistoryCommandsResponse addCommandsItem(AsyncDeviceListCommand commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        this.commands.add(commandsItem);
        return this;
    }

    public ListAsyncHistoryCommandsResponse withCommands(Consumer<List<AsyncDeviceListCommand>> commandsSetter) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /**
     * 设备历史命令列表。
     * @return commands
     */
    public List<AsyncDeviceListCommand> getCommands() {
        return commands;
    }

    public void setCommands(List<AsyncDeviceListCommand> commands) {
        this.commands = commands;
    }

    public ListAsyncHistoryCommandsResponse withPage(HistoryCommandPage page) {
        this.page = page;
        return this;
    }

    public ListAsyncHistoryCommandsResponse withPage(Consumer<HistoryCommandPage> pageSetter) {
        if (this.page == null) {
            this.page = new HistoryCommandPage();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public HistoryCommandPage getPage() {
        return page;
    }

    public void setPage(HistoryCommandPage page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAsyncHistoryCommandsResponse that = (ListAsyncHistoryCommandsResponse) obj;
        return Objects.equals(this.commands, that.commands) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAsyncHistoryCommandsResponse {\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
