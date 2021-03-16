package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.AsyncDeviceCommand;
import com.huaweicloud.sdk.iotda.v5.model.Page;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAsyncCommandsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="commands")
    
    private List<AsyncDeviceCommand> commands = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Page page;

    public ListAsyncCommandsResponse withCommands(List<AsyncDeviceCommand> commands) {
        this.commands = commands;
        return this;
    }

    
    public ListAsyncCommandsResponse addCommandsItem(AsyncDeviceCommand commandsItem) {
        this.commands.add(commandsItem);
        return this;
    }

    public ListAsyncCommandsResponse withCommands(Consumer<List<AsyncDeviceCommand>> commandsSetter) {
        if(this.commands == null ){
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /**
     * 设备命令列表。
     * @return commands
     */
    public List<AsyncDeviceCommand> getCommands() {
        return commands;
    }

    public void setCommands(List<AsyncDeviceCommand> commands) {
        this.commands = commands;
    }

    

    public ListAsyncCommandsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListAsyncCommandsResponse withPage(Consumer<Page> pageSetter) {
        if(this.page == null ){
            this.page = new Page();
            pageSetter.accept(this.page);
        }
        
        return this;
    }


    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAsyncCommandsResponse listAsyncCommandsResponse = (ListAsyncCommandsResponse) o;
        return Objects.equals(this.commands, listAsyncCommandsResponse.commands) &&
            Objects.equals(this.page, listAsyncCommandsResponse.page);
    }
    @Override
    public int hashCode() {
        return Objects.hash(commands, page);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAsyncCommandsResponse {\n");
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

