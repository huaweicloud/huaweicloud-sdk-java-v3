package com.huaweicloud.sdk.classroom.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.classroom.v3.model.*;

public class ClassroomClient {
    protected HcClient hcClient;

    public ClassroomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ClassroomClient> newBuilder() {
        return new ClientBuilder<>(ClassroomClient::new);
    }

    public ListClassroomMembersResponse listClassroomMembers(ListClassroomMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassroomMembers);
    }

    public ListClassroomsResponse listClassrooms(ListClassroomsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassrooms);
    }

    public ShowClassroomDetailResponse showClassroomDetail(ShowClassroomDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showClassroomDetail);
    }

    public ListClassroomMemberJobsResponse listClassroomMemberJobs(ListClassroomMemberJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listClassroomMemberJobs);
    }

    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listJobs);
    }

    public ListMemberJobRecordsResponse listMemberJobRecords(ListMemberJobRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.listMemberJobRecords);
    }

    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJobDetail);
    }

    public ShowJobExercisesResponse showJobExercises(ShowJobExercisesRequest request) {
        return hcClient.syncInvokeHttp(request, ClassroomMeta.showJobExercises);
    }

}