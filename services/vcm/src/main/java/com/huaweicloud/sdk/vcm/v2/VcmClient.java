package com.huaweicloud.sdk.vcm.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vcm.v2.model.*;

public class VcmClient {

    protected HcClient hcClient;

    public VcmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VcmClient> newBuilder() {
        return new ClientBuilder<>(VcmClient::new);
    }

    /**
     * 查询单个作业
     *
     * 该 API 用于查询并显示单个作业详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckAudioJobRequest 请求对象
     * @return CheckAudioJobResponse
     */
    public CheckAudioJobResponse checkAudioJob(CheckAudioJobRequest request) {
        return hcClient.syncInvokeHttp(request, VcmMeta.checkAudioJob);
    }

    /**
     * 查询单个作业
     *
     * 该 API 用于查询并显示单个作业详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckAudioJobRequest 请求对象
     * @return SyncInvoker<CheckAudioJobRequest, CheckAudioJobResponse>
     */
    public SyncInvoker<CheckAudioJobRequest, CheckAudioJobResponse> checkAudioJobInvoker(CheckAudioJobRequest request) {
        return new SyncInvoker<CheckAudioJobRequest, CheckAudioJobResponse>(request, VcmMeta.checkAudioJob, hcClient);
    }

    /**
     * 查询单个作业
     *
     * 该API用于查询并显示单个作业详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckVideoJobRequest 请求对象
     * @return CheckVideoJobResponse
     */
    public CheckVideoJobResponse checkVideoJob(CheckVideoJobRequest request) {
        return hcClient.syncInvokeHttp(request, VcmMeta.checkVideoJob);
    }

    /**
     * 查询单个作业
     *
     * 该API用于查询并显示单个作业详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckVideoJobRequest 请求对象
     * @return SyncInvoker<CheckVideoJobRequest, CheckVideoJobResponse>
     */
    public SyncInvoker<CheckVideoJobRequest, CheckVideoJobResponse> checkVideoJobInvoker(CheckVideoJobRequest request) {
        return new SyncInvoker<CheckVideoJobRequest, CheckVideoJobResponse>(request, VcmMeta.checkVideoJob, hcClient);
    }

    /**
     * 创建作业
     *
     * 该接口用于创建语音内容审核的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAudioJobRequest 请求对象
     * @return CreateAudioJobResponse
     */
    public CreateAudioJobResponse createAudioJob(CreateAudioJobRequest request) {
        return hcClient.syncInvokeHttp(request, VcmMeta.createAudioJob);
    }

    /**
     * 创建作业
     *
     * 该接口用于创建语音内容审核的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAudioJobRequest 请求对象
     * @return SyncInvoker<CreateAudioJobRequest, CreateAudioJobResponse>
     */
    public SyncInvoker<CreateAudioJobRequest, CreateAudioJobResponse> createAudioJobInvoker(
        CreateAudioJobRequest request) {
        return new SyncInvoker<CreateAudioJobRequest, CreateAudioJobResponse>(request, VcmMeta.createAudioJob,
            hcClient);
    }

    /**
     * 创建作业
     *
     * 该接口用于创建视频内容审核的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVideoJobRequest 请求对象
     * @return CreateVideoJobResponse
     */
    public CreateVideoJobResponse createVideoJob(CreateVideoJobRequest request) {
        return hcClient.syncInvokeHttp(request, VcmMeta.createVideoJob);
    }

    /**
     * 创建作业
     *
     * 该接口用于创建视频内容审核的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVideoJobRequest 请求对象
     * @return SyncInvoker<CreateVideoJobRequest, CreateVideoJobResponse>
     */
    public SyncInvoker<CreateVideoJobRequest, CreateVideoJobResponse> createVideoJobInvoker(
        CreateVideoJobRequest request) {
        return new SyncInvoker<CreateVideoJobRequest, CreateVideoJobResponse>(request, VcmMeta.createVideoJob,
            hcClient);
    }

    /**
     * 删除语音作业
     *
     * 删除语音作业
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDemoInfoRequest 请求对象
     * @return DeleteDemoInfoResponse
     */
    public DeleteDemoInfoResponse deleteDemoInfo(DeleteDemoInfoRequest request) {
        return hcClient.syncInvokeHttp(request, VcmMeta.deleteDemoInfo);
    }

    /**
     * 删除语音作业
     *
     * 删除语音作业
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDemoInfoRequest 请求对象
     * @return SyncInvoker<DeleteDemoInfoRequest, DeleteDemoInfoResponse>
     */
    public SyncInvoker<DeleteDemoInfoRequest, DeleteDemoInfoResponse> deleteDemoInfoInvoker(
        DeleteDemoInfoRequest request) {
        return new SyncInvoker<DeleteDemoInfoRequest, DeleteDemoInfoResponse>(request, VcmMeta.deleteDemoInfo,
            hcClient);
    }

    /**
     * 删除作业
     *
     * 该API用于删除指定作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVideoJobRequest 请求对象
     * @return DeleteVideoJobResponse
     */
    public DeleteVideoJobResponse deleteVideoJob(DeleteVideoJobRequest request) {
        return hcClient.syncInvokeHttp(request, VcmMeta.deleteVideoJob);
    }

    /**
     * 删除作业
     *
     * 该API用于删除指定作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVideoJobRequest 请求对象
     * @return SyncInvoker<DeleteVideoJobRequest, DeleteVideoJobResponse>
     */
    public SyncInvoker<DeleteVideoJobRequest, DeleteVideoJobResponse> deleteVideoJobInvoker(
        DeleteVideoJobRequest request) {
        return new SyncInvoker<DeleteVideoJobRequest, DeleteVideoJobResponse>(request, VcmMeta.deleteVideoJob,
            hcClient);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAudioJobsRequest 请求对象
     * @return ListAudioJobsResponse
     */
    public ListAudioJobsResponse listAudioJobs(ListAudioJobsRequest request) {
        return hcClient.syncInvokeHttp(request, VcmMeta.listAudioJobs);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAudioJobsRequest 请求对象
     * @return SyncInvoker<ListAudioJobsRequest, ListAudioJobsResponse>
     */
    public SyncInvoker<ListAudioJobsRequest, ListAudioJobsResponse> listAudioJobsInvoker(ListAudioJobsRequest request) {
        return new SyncInvoker<ListAudioJobsRequest, ListAudioJobsResponse>(request, VcmMeta.listAudioJobs, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 该API用于查询并显示视频内容审核的作业列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVideoJobsRequest 请求对象
     * @return ListVideoJobsResponse
     */
    public ListVideoJobsResponse listVideoJobs(ListVideoJobsRequest request) {
        return hcClient.syncInvokeHttp(request, VcmMeta.listVideoJobs);
    }

    /**
     * 查询作业列表
     *
     * 该API用于查询并显示视频内容审核的作业列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVideoJobsRequest 请求对象
     * @return SyncInvoker<ListVideoJobsRequest, ListVideoJobsResponse>
     */
    public SyncInvoker<ListVideoJobsRequest, ListVideoJobsResponse> listVideoJobsInvoker(ListVideoJobsRequest request) {
        return new SyncInvoker<ListVideoJobsRequest, ListVideoJobsResponse>(request, VcmMeta.listVideoJobs, hcClient);
    }

}
