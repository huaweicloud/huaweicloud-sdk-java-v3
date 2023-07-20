package com.huaweicloud.sdk.codeartsartifact.v2;

import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsArtifactAsyncClient {

    protected HcClient hcClient;

    public CodeArtsArtifactAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsArtifactAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsArtifactAsyncClient> clientBuilder =
            new ClientBuilder<>(CodeArtsArtifactAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectReleaseFilesRequest 请求对象
     * @return CompletableFuture<ShowProjectReleaseFilesResponse>
     */
    public CompletableFuture<ShowProjectReleaseFilesResponse> showProjectReleaseFilesAsync(
        ShowProjectReleaseFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showProjectReleaseFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectReleaseFilesRequest 请求对象
     * @return AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>
     */
    public AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFilesAsyncInvoker(
        ShowProjectReleaseFilesRequest request) {
        return new AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>(request,
            CodeArtsArtifactMeta.showProjectReleaseFiles, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseProjectFilesRequest 请求对象
     * @return CompletableFuture<ShowReleaseProjectFilesResponse>
     */
    public CompletableFuture<ShowReleaseProjectFilesResponse> showReleaseProjectFilesAsync(
        ShowReleaseProjectFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showReleaseProjectFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseProjectFilesRequest 请求对象
     * @return AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>
     */
    public AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFilesAsyncInvoker(
        ShowReleaseProjectFilesRequest request) {
        return new AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>(request,
            CodeArtsArtifactMeta.showReleaseProjectFiles, hcClient);
    }

}
