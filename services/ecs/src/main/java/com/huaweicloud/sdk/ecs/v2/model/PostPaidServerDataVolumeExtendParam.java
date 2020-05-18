package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 创建磁盘的extendparam字段
 */
public class PostPaidServerDataVolumeExtendParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceSpecCode")
    
    private String resourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceType")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshotId")
    
    private String snapshotId;

    public PostPaidServerDataVolumeExtendParam withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * 磁盘产品资源规格编码，如SATA，SAS和SSD。  > 说明： >  > 废弃字段。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public PostPaidServerDataVolumeExtendParam withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 磁盘产品资源类型。  > 说明： >  > 废弃字段。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public PostPaidServerDataVolumeExtendParam withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    


    /**
     * 整机镜像中自带的原始数据盘（简称“原数据盘”）所对应的快照ID或原始数据盘ID。  使用场景：  使用整机镜像创建云服务器，并且选择的整机镜像自带1个或者多个数据盘。  用途：  使用整机镜像创建云服务器时，系统会自动恢复整机镜像中自带数据盘（如果有）的数据，但是磁盘类型将被恢复为默认属性：普通I/O、VBD、非共享盘。此时，您可以通过snapshotID，修改指定原数据盘恢复后的磁盘类型。  > 说明： >  > 建议对每块原数据盘都指定snapshotID，否则，未指定的原数据盘将按默认属性进行创建。 > 如需修改磁盘大小，修改后的磁盘大小需大于等于原数据盘大小。否则，会影响原数据盘的数据恢复。  实现原理：  snapshotId是整机镜像自带原始数据盘的唯一标识，通过snapshotId可以获取原数据盘的磁盘信息，从而恢复数据盘数据。  快照ID的获取方法：  登录管理控制台，打开\"云硬盘 > 快照\"页面，根据原始数据盘的磁盘名称找到对应的快照ID。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerDataVolumeExtendParam postPaidServerDataVolumeExtendParam = (PostPaidServerDataVolumeExtendParam) o;
        return Objects.equals(this.resourceSpecCode, postPaidServerDataVolumeExtendParam.resourceSpecCode) &&
            Objects.equals(this.resourceType, postPaidServerDataVolumeExtendParam.resourceType) &&
            Objects.equals(this.snapshotId, postPaidServerDataVolumeExtendParam.snapshotId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, resourceType, snapshotId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerDataVolumeExtendParam {\n");
            sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
            sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
            sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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

