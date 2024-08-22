class VideoPlayer:
    def play_mkv(self, filename):
        pass

    def play_mp4(self, filename):
        pass

class MKVPlayer(VideoPlayer):
    def play_mkv(self, filename):
        print(f"Playing MKV file: {filename}")

    def play_mp4(self, filename):
        pass  # Não faz nada, pois só toca MKV

class MP4Player(VideoPlayer):
    def play_mkv(self, filename):
        pass  # Não faz nada, pois só toca MP4

    def play_mp4(self, filename):
        print(f"Playing MP4 file: {filename}")

class AudioPlayer:
    def play(self, audio_type, filename):
        pass

class MP3Player(AudioPlayer):
    def play(self, audio_type, filename):
        if audio_type == "mp3":
            print(f"Playing MP3 file: {filename}")
        else:
            print(f"Invalid audio type for MP3Player: {audio_type}")

class MediaAdapter(AudioPlayer):
    def __init__(self, audio_type):
        if audio_type == "mp4":
            self.player = MP4Player()
        elif audio_type == "mkv":
            self.player = MKVPlayer()
        else:
            self.player = None

    def play(self, audio_type, filename):
        if audio_type == "mp4":
            self.player.play_mp4(filename)
        elif audio_type == "mkv":
            self.player.play_mkv(filename)

class Winamp(AudioPlayer):
    def __init__(self):
        self.mp3_player = MP3Player()

    def play(self, audio_type, filename):
        if audio_type == "mp3":
            self.mp3_player.play(audio_type, filename)
        elif audio_type in ["mp4", "mkv"]:
            adapter = MediaAdapter(audio_type)
            adapter.play(audio_type, filename)
        else:
            print(f"Unsupported format: {audio_type}")

def main():
    winamp = Winamp()

    winamp.play("mp3", "song.mp3")
    winamp.play("mp4", "video.mp4")
    winamp.play("mkv", "movie.mkv")
    winamp.play("avi", "file.avi")  # Unsupported format

if __name__ == "__main__":
    main()