package com.huaweicloud.sdk.classroom.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.classroom.v3.model.*;

public class ClassroomAsyncClient {
    protected HcClient hcClient;

    public ClassroomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ClassroomAsyncClient> newBuilder() {
        return new ClientBuilder<>(ClassroomAsyncClient::new);
    }


    public CompletableFuture<ListClassroomMembersResponse> listClassroomMembersAsync(ListClassroomMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassroomMembers);
    }

    public CompletableFuture<ListClassroomsResponse> listClassroomsAsync(ListClassroomsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassrooms);
    }

    public CompletableFuture<ShowClassroomDetailResponse> showClassroomDetailAsync(ShowClassroomDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showClassroomDetail);
    }

    public CompletableFuture<ListClassroomMemberJobsResponse> listClassroomMemberJobsAsync(ListClassroomMemberJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listClassroomMemberJobs);
    }

    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listJobs);
    }

    public CompletableFuture<ListMemberJobRecordsResponse> listMemberJobRecordsAsync(ListMemberJobRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.listMemberJobRecords);
    }

    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showJobDetail);
    }

    public CompletableFuture<ShowJobExercisesResponse> showJobExercisesAsync(ShowJobExercisesRequest request) {
        return hcClient.asyncInvokeHttp(request, ClassroomMeta.showJobExercises);
    }

}