package ru.dumdumbich.logandblog.domain

import java.io.File

open class Note(
    var timestamp: String,
    var content: String
)

class TextNote(
    timestamp: String,
    content: String
) : Note(timestamp, content)

class ImageNote(
    var image: File,
    timestamp: String,
    content: String
) : Note(timestamp, content)

class VoiceNote(
    var voice: File,
    timestamp: String,
    content: String
) : Note(timestamp, content)
