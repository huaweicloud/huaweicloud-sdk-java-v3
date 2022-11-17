package com.huaweicloud.sdk.cloudartifact.v2;

import com.huaweicloud.sdk.cloudartifact.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudArtifactAsyncClient {

    protected HcClient hcClient;

    public CloudArtifactAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudArtifactAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudArtifactAsyncClient::new);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProjectReleaseFilesRequest 请求对象
     * @return CompletableFuture<ShowProjectReleaseFilesResponse>
     */
    public CompletableFuture<ShowProjectReleaseFilesResponse> showProjectReleaseFilesAsync(
        ShowProjectReleaseFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudArtifactMeta.showProjectReleaseFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProjectReleaseFilesRequest 请求对象
     * @return AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>
     */
    public AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFilesAsyncInvoker(
        ShowProjectReleaseFilesRequest request) {
        return new AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>(request,
            CloudArtifactMeta.showProjectReleaseFiles, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowReleaseProjectFilesRequest 请求对象
     * @return CompletableFuture<ShowReleaseProjectFilesResponse>
     */
    public CompletableFuture<ShowReleaseProjectFilesResponse> showReleaseProjectFilesAsync(
        ShowReleaseProjectFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudArtifactMeta.showReleaseProjectFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowReleaseProjectFilesRequest 请求对象
     * @return AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>
     */
    public AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFilesAsyncInvoker(
        ShowReleaseProjectFilesRequest request) {
        return new AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>(request,
            CloudArtifactMeta.showReleaseProjectFiles, hcClient);
    }

}
