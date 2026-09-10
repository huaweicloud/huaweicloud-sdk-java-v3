package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetInstancesOpsResourceUsageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private ResourceUsage cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private ResourceUsage mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private ResourceUsage disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io")

    private ResourceUsage io;

    public GetInstancesOpsResourceUsageResponse withCpu(ResourceUsage cpu) {
        this.cpu = cpu;
        return this;
    }

    public GetInstancesOpsResourceUsageResponse withCpu(Consumer<ResourceUsage> cpuSetter) {
        if (this.cpu == null) {
            this.cpu = new ResourceUsage();
            cpuSetter.accept(this.cpu);
        }

        return this;
    }

    /**
     * Get cpu
     * @return cpu
     */
    public ResourceUsage getCpu() {
        return cpu;
    }

    public void setCpu(ResourceUsage cpu) {
        this.cpu = cpu;
    }

    public GetInstancesOpsResourceUsageResponse withMem(ResourceUsage mem) {
        this.mem = mem;
        return this;
    }

    public GetInstancesOpsResourceUsageResponse withMem(Consumer<ResourceUsage> memSetter) {
        if (this.mem == null) {
            this.mem = new ResourceUsage();
            memSetter.accept(this.mem);
        }

        return this;
    }

    /**
     * Get mem
     * @return mem
     */
    public ResourceUsage getMem() {
        return mem;
    }

    public void setMem(ResourceUsage mem) {
        this.mem = mem;
    }

    public GetInstancesOpsResourceUsageResponse withDisk(ResourceUsage disk) {
        this.disk = disk;
        return this;
    }

    public GetInstancesOpsResourceUsageResponse withDisk(Consumer<ResourceUsage> diskSetter) {
        if (this.disk == null) {
            this.disk = new ResourceUsage();
            diskSetter.accept(this.disk);
        }

        return this;
    }

    /**
     * Get disk
     * @return disk
     */
    public ResourceUsage getDisk() {
        return disk;
    }

    public void setDisk(ResourceUsage disk) {
        this.disk = disk;
    }

    public GetInstancesOpsResourceUsageResponse withIo(ResourceUsage io) {
        this.io = io;
        return this;
    }

    public GetInstancesOpsResourceUsageResponse withIo(Consumer<ResourceUsage> ioSetter) {
        if (this.io == null) {
            this.io = new ResourceUsage();
            ioSetter.accept(this.io);
        }

        return this;
    }

    /**
     * Get io
     * @return io
     */
    public ResourceUsage getIo() {
        return io;
    }

    public void setIo(ResourceUsage io) {
        this.io = io;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetInstancesOpsResourceUsageResponse that = (GetInstancesOpsResourceUsageResponse) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.disk, that.disk) && Objects.equals(this.io, that.io);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, mem, disk, io);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetInstancesOpsResourceUsageResponse {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    io: ").append(toIndentedString(io)).append("\n");
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
