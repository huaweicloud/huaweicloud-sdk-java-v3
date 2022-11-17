package com.huaweicloud.sdk.cloudartifact.v2;

import com.huaweicloud.sdk.cloudartifact.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudArtifactClient {

    protected HcClient hcClient;

    public CloudArtifactClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudArtifactClient> newBuilder() {
        return new ClientBuilder<>(CloudArtifactClient::new);
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
     * @return ShowProjectReleaseFilesResponse
     */
    public ShowProjectReleaseFilesResponse showProjectReleaseFiles(ShowProjectReleaseFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudArtifactMeta.showProjectReleaseFiles);
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
     * @return SyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>
     */
    public SyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFilesInvoker(
        ShowProjectReleaseFilesRequest request) {
        return new SyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>(request,
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
     * @return ShowReleaseProjectFilesResponse
     */
    public ShowReleaseProjectFilesResponse showReleaseProjectFiles(ShowReleaseProjectFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudArtifactMeta.showReleaseProjectFiles);
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
     * @return SyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>
     */
    public SyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFilesInvoker(
        ShowReleaseProjectFilesRequest request) {
        return new SyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>(request,
            CloudArtifactMeta.showReleaseProjectFiles, hcClient);
    }

}
