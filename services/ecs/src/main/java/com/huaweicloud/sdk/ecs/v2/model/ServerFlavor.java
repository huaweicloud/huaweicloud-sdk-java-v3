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
 * 弹性云服务器规格信息。
 */
public class ServerFlavor  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk")
    
    private String disk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    private String vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    private String ram;

    public ServerFlavor withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 弹性云服务器规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerFlavor withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 弹性云服务器规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerFlavor withDisk(String disk) {
        this.disk = disk;
        return this;
    }

    


    /**
     * 该云服务器规格对应要求系统盘大小，0为不限制。此字段在本系统中无效。
     * @return disk
     */
    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public ServerFlavor withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    


    /**
     * 该云服务器规格对应的CPU核数。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public ServerFlavor withRam(String ram) {
        this.ram = ram;
        return this;
    }

    


    /**
     * 该云服务器规格对应的内存大小，单位为MB。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerFlavor serverFlavor = (ServerFlavor) o;
        return Objects.equals(this.id, serverFlavor.id) &&
            Objects.equals(this.name, serverFlavor.name) &&
            Objects.equals(this.disk, serverFlavor.disk) &&
            Objects.equals(this.vcpus, serverFlavor.vcpus) &&
            Objects.equals(this.ram, serverFlavor.ram);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, disk, vcpus, ram);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerFlavor {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
            sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
            sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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

