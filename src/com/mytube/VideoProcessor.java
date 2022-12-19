package com.mytube;

public class VideoProcessor {
  private Encodable encoder;
  private Storable database;
  private Sendable emailService;

  public VideoProcessor(
    Encodable encoder,
    Storable database,
    Sendable emailService) {
      this.encoder = encoder;
      this.database = database;
      this.emailService = emailService;
  }

  public void process(Video video) {
    encoder.encode(video);
    database.store(video);
    emailService.sendEmail(video.getUser());
  }
}
