package com.kevin.music.data

import com.kevin.music.model.Album


class DataSource {
fun getAlbumes(): MutableList<Album> {
    var albumes: MutableList<Album> = mutableListOf()
    albumes.add(Album("Nadie sabe lo que va a pasar mañana","2022", "https://images3.memedroid.com/images/UPLOADED136/60444363904ad.jpeg"))
    albumes.add(Album("Nadie sabe lo que va a pasar mañana","2022", "https://images3.memedroid.com/images/UPLOADED136/60444363904ad.jpeg"))
    albumes.add(Album("Nadie sabe lo que va a pasar mañana","2022", "https://images3.memedroid.com/images/UPLOADED136/60444363904ad.jpeg"))
    albumes.add(Album("Nadie sabe lo que va a pasar mañana","2022", "https://images3.memedroid.com/images/UPLOADED136/60444363904ad.jpeg"))
    albumes.add(Album("Nadie sabe lo que va a pasar mañana","2022", "https://images3.memedroid.com/images/UPLOADED136/60444363904ad.jpeg"))
    return albumes
    }
}