package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class DownloadAssetArchiveResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<String> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<AppAssetTasks> tasks = null;

    public DownloadAssetArchiveResponse withApps(List<String> apps) {
        this.apps = apps;
        return this;
    }

    public DownloadAssetArchiveResponse addAppsItem(String appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public DownloadAssetArchiveResponse withApps(Consumer<List<String>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /** 应用列表
     * 
     * @return apps */
    public List<String> getApps() {
        return apps;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    public DownloadAssetArchiveResponse withTasks(List<AppAssetTasks> tasks) {
        this.tasks = tasks;
        return this;
    }

    public DownloadAssetArchiveResponse addTasksItem(AppAssetTasks tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public DownloadAssetArchiveResponse withTasks(Consumer<List<AppAssetTasks>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /** 任务列表
     * 
     * @return tasks */
    public List<AppAssetTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<AppAssetTasks> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadAssetArchiveResponse downloadAssetArchiveResponse = (DownloadAssetArchiveResponse) o;
        return Objects.equals(this.apps, downloadAssetArchiveResponse.apps)
            && Objects.equals(this.tasks, downloadAssetArchiveResponse.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apps, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadAssetArchiveResponse {\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
