// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package web.service.grpc.user;

public interface GetAllUserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllUserResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .GetAllUserResponse.UserGrpcModel allUser = 1;</code>
   */
  java.util.List<web.service.grpc.user.GetAllUserResponse.UserGrpcModel> 
      getAllUserList();
  /**
   * <code>repeated .GetAllUserResponse.UserGrpcModel allUser = 1;</code>
   */
  web.service.grpc.user.GetAllUserResponse.UserGrpcModel getAllUser(int index);
  /**
   * <code>repeated .GetAllUserResponse.UserGrpcModel allUser = 1;</code>
   */
  int getAllUserCount();
  /**
   * <code>repeated .GetAllUserResponse.UserGrpcModel allUser = 1;</code>
   */
  java.util.List<? extends web.service.grpc.user.GetAllUserResponse.UserGrpcModelOrBuilder> 
      getAllUserOrBuilderList();
  /**
   * <code>repeated .GetAllUserResponse.UserGrpcModel allUser = 1;</code>
   */
  web.service.grpc.user.GetAllUserResponse.UserGrpcModelOrBuilder getAllUserOrBuilder(
      int index);
}
