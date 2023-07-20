package com.huaweicloud.sdk.vcm.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vcm.v2.model.CheckAudioJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.CheckAudioJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.CheckVideoJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.CheckVideoJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.CreateAudioJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.CreateAudioJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.CreateVideoJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.CreateVideoJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.DeleteDemoInfoRequest;
import com.huaweicloud.sdk.vcm.v2.model.DeleteDemoInfoResponse;
import com.huaweicloud.sdk.vcm.v2.model.DeleteVideoJobRequest;
import com.huaweicloud.sdk.vcm.v2.model.DeleteVideoJobResponse;
import com.huaweicloud.sdk.vcm.v2.model.ListAudioJobsRequest;
import com.huaweicloud.sdk.vcm.v2.model.ListAudioJobsResponse;
import com.huaweicloud.sdk.vcm.v2.model.ListVideoJobsRequest;
import com.huaweicloud.sdk.vcm.v2.model.ListVideoJobsResponse;

import java.util.concurrent.CompletableFuture;

public class VcmAsyncClient {

    protected HcClient hcClient;

    public VcmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VcmAsyncClient> newBuilder() {
        ClientBuilder<VcmAsyncClient> clientBuilder = new ClientBuilder<>(VcmAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 查询单个作业
     *
     * 该 API 用于查询并显示单个作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckAudioJobRequest 请求对象
     * @return CompletableFuture<CheckAudioJobResponse>
     */
    public CompletableFuture<CheckAudioJobResponse> checkAudioJobAsync(CheckAudioJobRequest request) {
        return hcClient.asyncInvokeHttp(request, VcmMeta.checkAudioJob);
    }

    /**
     * 查询单个作业
     *
     * 该 API 用于查询并显示单个作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckAudioJobRequest 请求对象
     * @return AsyncInvoker<CheckAudioJobRequest, CheckAudioJobResponse>
     */
    public AsyncInvoker<CheckAudioJobRequest, CheckAudioJobResponse> checkAudioJobAsyncInvoker(
        CheckAudioJobRequest request) {
        return new AsyncInvoker<CheckAudioJobRequest, CheckAudioJobResponse>(request, VcmMeta.checkAudioJob, hcClient);
    }

    /**
     * 查询单个作业
     *
     * 该API用于查询并显示单个作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckVideoJobRequest 请求对象
     * @return CompletableFuture<CheckVideoJobResponse>
     */
    public CompletableFuture<CheckVideoJobResponse> checkVideoJobAsync(CheckVideoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, VcmMeta.checkVideoJob);
    }

    /**
     * 查询单个作业
     *
     * 该API用于查询并显示单个作业详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckVideoJobRequest 请求对象
     * @return AsyncInvoker<CheckVideoJobRequest, CheckVideoJobResponse>
     */
    public AsyncInvoker<CheckVideoJobRequest, CheckVideoJobResponse> checkVideoJobAsyncInvoker(
        CheckVideoJobRequest request) {
        return new AsyncInvoker<CheckVideoJobRequest, CheckVideoJobResponse>(request, VcmMeta.checkVideoJob, hcClient);
    }

    /**
     * 创建作业
     *
     * 该接口用于创建语音内容审核的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAudioJobRequest 请求对象
     * @return CompletableFuture<CreateAudioJobResponse>
     */
    public CompletableFuture<CreateAudioJobResponse> createAudioJobAsync(CreateAudioJobRequest request) {
        return hcClient.asyncInvokeHttp(request, VcmMeta.createAudioJob);
    }

    /**
     * 创建作业
     *
     * 该接口用于创建语音内容审核的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAudioJobRequest 请求对象
     * @return AsyncInvoker<CreateAudioJobRequest, CreateAudioJobResponse>
     */
    public AsyncInvoker<CreateAudioJobRequest, CreateAudioJobResponse> createAudioJobAsyncInvoker(
        CreateAudioJobRequest request) {
        return new AsyncInvoker<CreateAudioJobRequest, CreateAudioJobResponse>(request, VcmMeta.createAudioJob,
            hcClient);
    }

    /**
     * 创建作业
     *
     * 该接口用于创建视频内容审核的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoJobRequest 请求对象
     * @return CompletableFuture<CreateVideoJobResponse>
     */
    public CompletableFuture<CreateVideoJobResponse> createVideoJobAsync(CreateVideoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, VcmMeta.createVideoJob);
    }

    /**
     * 创建作业
     *
     * 该接口用于创建视频内容审核的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoJobRequest 请求对象
     * @return AsyncInvoker<CreateVideoJobRequest, CreateVideoJobResponse>
     */
    public AsyncInvoker<CreateVideoJobRequest, CreateVideoJobResponse> createVideoJobAsyncInvoker(
        CreateVideoJobRequest request) {
        return new AsyncInvoker<CreateVideoJobRequest, CreateVideoJobResponse>(request, VcmMeta.createVideoJob,
            hcClient);
    }

    /**
     * 删除语音作业
     *
     * 删除语音作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDemoInfoRequest 请求对象
     * @return CompletableFuture<DeleteDemoInfoResponse>
     */
    public CompletableFuture<DeleteDemoInfoResponse> deleteDemoInfoAsync(DeleteDemoInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, VcmMeta.deleteDemoInfo);
    }

    /**
     * 删除语音作业
     *
     * 删除语音作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDemoInfoRequest 请求对象
     * @return AsyncInvoker<DeleteDemoInfoRequest, DeleteDemoInfoResponse>
     */
    public AsyncInvoker<DeleteDemoInfoRequest, DeleteDemoInfoResponse> deleteDemoInfoAsyncInvoker(
        DeleteDemoInfoRequest request) {
        return new AsyncInvoker<DeleteDemoInfoRequest, DeleteDemoInfoResponse>(request, VcmMeta.deleteDemoInfo,
            hcClient);
    }

    /**
     * 删除作业
     *
     * 该API用于删除指定作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVideoJobRequest 请求对象
     * @return CompletableFuture<DeleteVideoJobResponse>
     */
    public CompletableFuture<DeleteVideoJobResponse> deleteVideoJobAsync(DeleteVideoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, VcmMeta.deleteVideoJob);
    }

    /**
     * 删除作业
     *
     * 该API用于删除指定作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVideoJobRequest 请求对象
     * @return AsyncInvoker<DeleteVideoJobRequest, DeleteVideoJobResponse>
     */
    public AsyncInvoker<DeleteVideoJobRequest, DeleteVideoJobResponse> deleteVideoJobAsyncInvoker(
        DeleteVideoJobRequest request) {
        return new AsyncInvoker<DeleteVideoJobRequest, DeleteVideoJobResponse>(request, VcmMeta.deleteVideoJob,
            hcClient);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAudioJobsRequest 请求对象
     * @return CompletableFuture<ListAudioJobsResponse>
     */
    public CompletableFuture<ListAudioJobsResponse> listAudioJobsAsync(ListAudioJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, VcmMeta.listAudioJobs);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAudioJobsRequest 请求对象
     * @return AsyncInvoker<ListAudioJobsRequest, ListAudioJobsResponse>
     */
    public AsyncInvoker<ListAudioJobsRequest, ListAudioJobsResponse> listAudioJobsAsyncInvoker(
        ListAudioJobsRequest request) {
        return new AsyncInvoker<ListAudioJobsRequest, ListAudioJobsResponse>(request, VcmMeta.listAudioJobs, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 该API用于查询并显示视频内容审核的作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVideoJobsRequest 请求对象
     * @return CompletableFuture<ListVideoJobsResponse>
     */
    public CompletableFuture<ListVideoJobsResponse> listVideoJobsAsync(ListVideoJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, VcmMeta.listVideoJobs);
    }

    /**
     * 查询作业列表
     *
     * 该API用于查询并显示视频内容审核的作业列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVideoJobsRequest 请求对象
     * @return AsyncInvoker<ListVideoJobsRequest, ListVideoJobsResponse>
     */
    public AsyncInvoker<ListVideoJobsRequest, ListVideoJobsResponse> listVideoJobsAsyncInvoker(
        ListVideoJobsRequest request) {
        return new AsyncInvoker<ListVideoJobsRequest, ListVideoJobsResponse>(request, VcmMeta.listVideoJobs, hcClient);
    }

}
