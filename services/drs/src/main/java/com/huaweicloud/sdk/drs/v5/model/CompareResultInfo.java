package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询对比任务信息体。
 */
public class CompareResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects_compare_overview_info")

    private ObjectsCompareTaskInfo objectsCompareOverviewInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects_compare_detail_infos")

    private List<ObjectsCompareDetailInfo> objectsCompareDetailInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_compare_task_list")

    private List<CompareJobInfo> dataCompareTaskList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_overview_infos")

    private List<LineCompareOverviewInfo> lineCompareOverviewInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_detail_infos")

    private List<TableLineCompareDetailInfo> lineCompareDetailInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_overview_infos")

    private List<ContentCompareOverviewInfo> contentCompareOverviewInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_detail_infos")

    private List<ContentCompareDetailInfo> contentCompareDetailInfos = null;

    public CompareResultInfo withObjectsCompareOverviewInfo(ObjectsCompareTaskInfo objectsCompareOverviewInfo) {
        this.objectsCompareOverviewInfo = objectsCompareOverviewInfo;
        return this;
    }

    public CompareResultInfo withObjectsCompareOverviewInfo(
        Consumer<ObjectsCompareTaskInfo> objectsCompareOverviewInfoSetter) {
        if (this.objectsCompareOverviewInfo == null) {
            this.objectsCompareOverviewInfo = new ObjectsCompareTaskInfo();
            objectsCompareOverviewInfoSetter.accept(this.objectsCompareOverviewInfo);
        }

        return this;
    }

    /**
     * Get objectsCompareOverviewInfo
     * @return objectsCompareOverviewInfo
     */
    public ObjectsCompareTaskInfo getObjectsCompareOverviewInfo() {
        return objectsCompareOverviewInfo;
    }

    public void setObjectsCompareOverviewInfo(ObjectsCompareTaskInfo objectsCompareOverviewInfo) {
        this.objectsCompareOverviewInfo = objectsCompareOverviewInfo;
    }

    public CompareResultInfo withObjectsCompareDetailInfos(List<ObjectsCompareDetailInfo> objectsCompareDetailInfos) {
        this.objectsCompareDetailInfos = objectsCompareDetailInfos;
        return this;
    }

    public CompareResultInfo addObjectsCompareDetailInfosItem(ObjectsCompareDetailInfo objectsCompareDetailInfosItem) {
        if (this.objectsCompareDetailInfos == null) {
            this.objectsCompareDetailInfos = new ArrayList<>();
        }
        this.objectsCompareDetailInfos.add(objectsCompareDetailInfosItem);
        return this;
    }

    public CompareResultInfo withObjectsCompareDetailInfos(
        Consumer<List<ObjectsCompareDetailInfo>> objectsCompareDetailInfosSetter) {
        if (this.objectsCompareDetailInfos == null) {
            this.objectsCompareDetailInfos = new ArrayList<>();
        }
        objectsCompareDetailInfosSetter.accept(this.objectsCompareDetailInfos);
        return this;
    }

    /**
     * 对象级对比详情信息体。
     * @return objectsCompareDetailInfos
     */
    public List<ObjectsCompareDetailInfo> getObjectsCompareDetailInfos() {
        return objectsCompareDetailInfos;
    }

    public void setObjectsCompareDetailInfos(List<ObjectsCompareDetailInfo> objectsCompareDetailInfos) {
        this.objectsCompareDetailInfos = objectsCompareDetailInfos;
    }

    public CompareResultInfo withDataCompareTaskList(List<CompareJobInfo> dataCompareTaskList) {
        this.dataCompareTaskList = dataCompareTaskList;
        return this;
    }

    public CompareResultInfo addDataCompareTaskListItem(CompareJobInfo dataCompareTaskListItem) {
        if (this.dataCompareTaskList == null) {
            this.dataCompareTaskList = new ArrayList<>();
        }
        this.dataCompareTaskList.add(dataCompareTaskListItem);
        return this;
    }

    public CompareResultInfo withDataCompareTaskList(Consumer<List<CompareJobInfo>> dataCompareTaskListSetter) {
        if (this.dataCompareTaskList == null) {
            this.dataCompareTaskList = new ArrayList<>();
        }
        dataCompareTaskListSetter.accept(this.dataCompareTaskList);
        return this;
    }

    /**
     * 数据对比任务列表。
     * @return dataCompareTaskList
     */
    public List<CompareJobInfo> getDataCompareTaskList() {
        return dataCompareTaskList;
    }

    public void setDataCompareTaskList(List<CompareJobInfo> dataCompareTaskList) {
        this.dataCompareTaskList = dataCompareTaskList;
    }

    public CompareResultInfo withLineCompareOverviewInfos(List<LineCompareOverviewInfo> lineCompareOverviewInfos) {
        this.lineCompareOverviewInfos = lineCompareOverviewInfos;
        return this;
    }

    public CompareResultInfo addLineCompareOverviewInfosItem(LineCompareOverviewInfo lineCompareOverviewInfosItem) {
        if (this.lineCompareOverviewInfos == null) {
            this.lineCompareOverviewInfos = new ArrayList<>();
        }
        this.lineCompareOverviewInfos.add(lineCompareOverviewInfosItem);
        return this;
    }

    public CompareResultInfo withLineCompareOverviewInfos(
        Consumer<List<LineCompareOverviewInfo>> lineCompareOverviewInfosSetter) {
        if (this.lineCompareOverviewInfos == null) {
            this.lineCompareOverviewInfos = new ArrayList<>();
        }
        lineCompareOverviewInfosSetter.accept(this.lineCompareOverviewInfos);
        return this;
    }

    /**
     * 行数对比概览信息体。
     * @return lineCompareOverviewInfos
     */
    public List<LineCompareOverviewInfo> getLineCompareOverviewInfos() {
        return lineCompareOverviewInfos;
    }

    public void setLineCompareOverviewInfos(List<LineCompareOverviewInfo> lineCompareOverviewInfos) {
        this.lineCompareOverviewInfos = lineCompareOverviewInfos;
    }

    public CompareResultInfo withLineCompareDetailInfos(List<TableLineCompareDetailInfo> lineCompareDetailInfos) {
        this.lineCompareDetailInfos = lineCompareDetailInfos;
        return this;
    }

    public CompareResultInfo addLineCompareDetailInfosItem(TableLineCompareDetailInfo lineCompareDetailInfosItem) {
        if (this.lineCompareDetailInfos == null) {
            this.lineCompareDetailInfos = new ArrayList<>();
        }
        this.lineCompareDetailInfos.add(lineCompareDetailInfosItem);
        return this;
    }

    public CompareResultInfo withLineCompareDetailInfos(
        Consumer<List<TableLineCompareDetailInfo>> lineCompareDetailInfosSetter) {
        if (this.lineCompareDetailInfos == null) {
            this.lineCompareDetailInfos = new ArrayList<>();
        }
        lineCompareDetailInfosSetter.accept(this.lineCompareDetailInfos);
        return this;
    }

    /**
     * 行数对比任务表级详情。
     * @return lineCompareDetailInfos
     */
    public List<TableLineCompareDetailInfo> getLineCompareDetailInfos() {
        return lineCompareDetailInfos;
    }

    public void setLineCompareDetailInfos(List<TableLineCompareDetailInfo> lineCompareDetailInfos) {
        this.lineCompareDetailInfos = lineCompareDetailInfos;
    }

    public CompareResultInfo withContentCompareOverviewInfos(
        List<ContentCompareOverviewInfo> contentCompareOverviewInfos) {
        this.contentCompareOverviewInfos = contentCompareOverviewInfos;
        return this;
    }

    public CompareResultInfo addContentCompareOverviewInfosItem(
        ContentCompareOverviewInfo contentCompareOverviewInfosItem) {
        if (this.contentCompareOverviewInfos == null) {
            this.contentCompareOverviewInfos = new ArrayList<>();
        }
        this.contentCompareOverviewInfos.add(contentCompareOverviewInfosItem);
        return this;
    }

    public CompareResultInfo withContentCompareOverviewInfos(
        Consumer<List<ContentCompareOverviewInfo>> contentCompareOverviewInfosSetter) {
        if (this.contentCompareOverviewInfos == null) {
            this.contentCompareOverviewInfos = new ArrayList<>();
        }
        contentCompareOverviewInfosSetter.accept(this.contentCompareOverviewInfos);
        return this;
    }

    /**
     * 内容对比概览信息体。
     * @return contentCompareOverviewInfos
     */
    public List<ContentCompareOverviewInfo> getContentCompareOverviewInfos() {
        return contentCompareOverviewInfos;
    }

    public void setContentCompareOverviewInfos(List<ContentCompareOverviewInfo> contentCompareOverviewInfos) {
        this.contentCompareOverviewInfos = contentCompareOverviewInfos;
    }

    public CompareResultInfo withContentCompareDetailInfos(List<ContentCompareDetailInfo> contentCompareDetailInfos) {
        this.contentCompareDetailInfos = contentCompareDetailInfos;
        return this;
    }

    public CompareResultInfo addContentCompareDetailInfosItem(ContentCompareDetailInfo contentCompareDetailInfosItem) {
        if (this.contentCompareDetailInfos == null) {
            this.contentCompareDetailInfos = new ArrayList<>();
        }
        this.contentCompareDetailInfos.add(contentCompareDetailInfosItem);
        return this;
    }

    public CompareResultInfo withContentCompareDetailInfos(
        Consumer<List<ContentCompareDetailInfo>> contentCompareDetailInfosSetter) {
        if (this.contentCompareDetailInfos == null) {
            this.contentCompareDetailInfos = new ArrayList<>();
        }
        contentCompareDetailInfosSetter.accept(this.contentCompareDetailInfos);
        return this;
    }

    /**
     * 内容对比详情信息体。
     * @return contentCompareDetailInfos
     */
    public List<ContentCompareDetailInfo> getContentCompareDetailInfos() {
        return contentCompareDetailInfos;
    }

    public void setContentCompareDetailInfos(List<ContentCompareDetailInfo> contentCompareDetailInfos) {
        this.contentCompareDetailInfos = contentCompareDetailInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareResultInfo compareResultInfo = (CompareResultInfo) o;
        return Objects.equals(this.objectsCompareOverviewInfo, compareResultInfo.objectsCompareOverviewInfo)
            && Objects.equals(this.objectsCompareDetailInfos, compareResultInfo.objectsCompareDetailInfos)
            && Objects.equals(this.dataCompareTaskList, compareResultInfo.dataCompareTaskList)
            && Objects.equals(this.lineCompareOverviewInfos, compareResultInfo.lineCompareOverviewInfos)
            && Objects.equals(this.lineCompareDetailInfos, compareResultInfo.lineCompareDetailInfos)
            && Objects.equals(this.contentCompareOverviewInfos, compareResultInfo.contentCompareOverviewInfos)
            && Objects.equals(this.contentCompareDetailInfos, compareResultInfo.contentCompareDetailInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectsCompareOverviewInfo,
            objectsCompareDetailInfos,
            dataCompareTaskList,
            lineCompareOverviewInfos,
            lineCompareDetailInfos,
            contentCompareOverviewInfos,
            contentCompareDetailInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareResultInfo {\n");
        sb.append("    objectsCompareOverviewInfo: ").append(toIndentedString(objectsCompareOverviewInfo)).append("\n");
        sb.append("    objectsCompareDetailInfos: ").append(toIndentedString(objectsCompareDetailInfos)).append("\n");
        sb.append("    dataCompareTaskList: ").append(toIndentedString(dataCompareTaskList)).append("\n");
        sb.append("    lineCompareOverviewInfos: ").append(toIndentedString(lineCompareOverviewInfos)).append("\n");
        sb.append("    lineCompareDetailInfos: ").append(toIndentedString(lineCompareDetailInfos)).append("\n");
        sb.append("    contentCompareOverviewInfos: ")
            .append(toIndentedString(contentCompareOverviewInfos))
            .append("\n");
        sb.append("    contentCompareDetailInfos: ").append(toIndentedString(contentCompareDetailInfos)).append("\n");
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
