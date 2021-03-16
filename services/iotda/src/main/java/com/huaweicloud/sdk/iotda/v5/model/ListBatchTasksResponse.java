package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.Page;
import com.huaweicloud.sdk.iotda.v5.model.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBatchTasksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="batchtasks")
    
    private List<Task> batchtasks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Page page;

    public ListBatchTasksResponse withBatchtasks(List<Task> batchtasks) {
        this.batchtasks = batchtasks;
        return this;
    }

    
    public ListBatchTasksResponse addBatchtasksItem(Task batchtasksItem) {
        this.batchtasks.add(batchtasksItem);
        return this;
    }

    public ListBatchTasksResponse withBatchtasks(Consumer<List<Task>> batchtasksSetter) {
        if(this.batchtasks == null ){
            this.batchtasks = new ArrayList<>();
        }
        batchtasksSetter.accept(this.batchtasks);
        return this;
    }

    /**
     * 批量任务列表。
     * @return batchtasks
     */
    public List<Task> getBatchtasks() {
        return batchtasks;
    }

    public void setBatchtasks(List<Task> batchtasks) {
        this.batchtasks = batchtasks;
    }

    

    public ListBatchTasksResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListBatchTasksResponse withPage(Consumer<Page> pageSetter) {
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
        ListBatchTasksResponse listBatchTasksResponse = (ListBatchTasksResponse) o;
        return Objects.equals(this.batchtasks, listBatchTasksResponse.batchtasks) &&
            Objects.equals(this.page, listBatchTasksResponse.page);
    }
    @Override
    public int hashCode() {
        return Objects.hash(batchtasks, page);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBatchTasksResponse {\n");
        sb.append("    batchtasks: ").append(toIndentedString(batchtasks)).append("\n");
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

