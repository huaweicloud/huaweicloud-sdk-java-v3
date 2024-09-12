package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 录制切片段落
 */
public class SegmentDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manualOrder")

    private Integer manualOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentOrder")

    private Integer segmentOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentSize")

    private String segmentSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileList")

    private List<SegmentFileDO> fileList = null;

    public SegmentDO withManualOrder(Integer manualOrder) {
        this.manualOrder = manualOrder;
        return this;
    }

    /**
     * 录制人工分段序号，每次启动录制，生成一个分段
     * @return manualOrder
     */
    public Integer getManualOrder() {
        return manualOrder;
    }

    public void setManualOrder(Integer manualOrder) {
        this.manualOrder = manualOrder;
    }

    public SegmentDO withSegmentOrder(Integer segmentOrder) {
        this.segmentOrder = segmentOrder;
        return this;
    }

    /**
     * 录制片段内的文件自动切片序号（每次启动录制后，每三小时一个分片文件，多次人工启动重新从1开始）
     * @return segmentOrder
     */
    public Integer getSegmentOrder() {
        return segmentOrder;
    }

    public void setSegmentOrder(Integer segmentOrder) {
        this.segmentOrder = segmentOrder;
    }

    public SegmentDO withSegmentSize(String segmentSize) {
        this.segmentSize = segmentSize;
        return this;
    }

    /**
     * 录制分段总文件大小（字节）
     * @return segmentSize
     */
    public String getSegmentSize() {
        return segmentSize;
    }

    public void setSegmentSize(String segmentSize) {
        this.segmentSize = segmentSize;
    }

    public SegmentDO withFileList(List<SegmentFileDO> fileList) {
        this.fileList = fileList;
        return this;
    }

    public SegmentDO addFileListItem(SegmentFileDO fileListItem) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        this.fileList.add(fileListItem);
        return this;
    }

    public SegmentDO withFileList(Consumer<List<SegmentFileDO>> fileListSetter) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        fileListSetter.accept(this.fileList);
        return this;
    }

    /**
     * 录制文件自动切片列表，每3小时文件切片一次
     * @return fileList
     */
    public List<SegmentFileDO> getFileList() {
        return fileList;
    }

    public void setFileList(List<SegmentFileDO> fileList) {
        this.fileList = fileList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SegmentDO that = (SegmentDO) obj;
        return Objects.equals(this.manualOrder, that.manualOrder)
            && Objects.equals(this.segmentOrder, that.segmentOrder)
            && Objects.equals(this.segmentSize, that.segmentSize) && Objects.equals(this.fileList, that.fileList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualOrder, segmentOrder, segmentSize, fileList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SegmentDO {\n");
        sb.append("    manualOrder: ").append(toIndentedString(manualOrder)).append("\n");
        sb.append("    segmentOrder: ").append(toIndentedString(segmentOrder)).append("\n");
        sb.append("    segmentSize: ").append(toIndentedString(segmentSize)).append("\n");
        sb.append("    fileList: ").append(toIndentedString(fileList)).append("\n");
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
